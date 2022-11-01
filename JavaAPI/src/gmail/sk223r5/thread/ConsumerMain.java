package gmail.sk223r5.thread;

public class ConsumerMain {
	public static void main(String[] args) {
		System.out.println("test");
		Product prd = new Product();
		/*
		 * 리스트에 데이터가 없는데 Consumer 스레드가 데이터를 꺼내려고 해서 발생하는 문제
		 * 	소비자 스레드의 메서드는 데이터가 없을 때 대기하고 생산자 스레드는 데이터를
		 * 	 만들어 낸 경우 데이터가 만들어졌다고 알려주어야 함
		 * 
		 * 기다리기 위해 호출하는 메서드는 wait, 알려주기 위해 호출하는 메서드는 notify
		 */
		new Producer(prd).start();
		new Consumer(prd).start();
		
		
	}

}
