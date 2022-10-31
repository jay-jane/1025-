package gmail.sk223r5.thread;

public class Mutex {
	public static void main(String[] args) {
		
		//Runnable 인터페이스로부터 상속받은 클래스
		ShareData sh = new ShareData();
		
		//스레드 생성
		Thread th1 = new Thread(sh);
		th1.start();
		
		Thread th2 = new Thread(sh);
		th2.start();
		/*
		 * ShareData 인스턴스를 하나만 만들어서 공유하는데 하나의 작업이 완료되기 전에
		 * 다른 스레드가 공유 자원을 수정하기 때문에 문제가 생김
		 * 
		 * > 한 번에 실행되어야 하는 코드를 가진 영역을 찾고 메서드에 synchronized를
		 * 붙이거나 코드 영역을 synchronized(공유객체){}로 묶어주면 된다
		 * 	묶인 영역의 코드는 동시에 수정할 수 없다
		 * 
		 * 		synchronized 메서드 보다는 블럭을 만드는 것을 권장
		 * 		> 메서드는 영역이 커져서 공유도가 떨어짐
		 */
		try {
			//앞의 동작이 스레드로 동작하기 때문에 작업이 끝날 때 까지 대기 후 결과 출력
			Thread.sleep(3000);
			System.out.println(sh.getResult());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
