package gmail.sk223r5.thread;

//Thread 클래스로부터 상속받는 클래스 생성
class ThreadEx extends Thread {
	@Override //상위클래스나 인터페이스에서 제공하는 메서드가 아닌 경우 에러 발생
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("스레드 메서드");
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}

//Runnable 인터페이스를 구현한 클래스 생성
class RunnableImpl implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("러너블 메서드");
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}

}

public class ThreadCreate {
	public static void main(String[] args) {

		Thread th = new ThreadEx();
		Thread rn = new Thread(new RunnableImpl());
		th.run(); //프로세스 실행
		th.start(); //스레드 실행
		rn.start();

		//Anonymous Class 활용
		Thread an = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("익명 메서드");
					} catch (InterruptedException e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}});
		an.start();

		//Lambda 활용 - 메서드가 하나이기 때문에 사용 가능함
		Thread ld = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("람다 메서드");
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		ld.start();
	}

}
