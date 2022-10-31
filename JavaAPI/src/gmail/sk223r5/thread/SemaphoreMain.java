package gmail.sk223r5.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
	public static void main(String[] args) {
		
		//2개씩 실행할 수 있는 세마포어
		Semaphore semaphore = new Semaphore(1);
		
		Thread th1 = new Thread(new SemaphoreThread("이이이", semaphore));
		Thread th2 = new Thread(new SemaphoreThread("김김김", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("박박박", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("임임임", semaphore));
		
		//sleep 시간이 지나면 4개 스레드가 동시에 메시지 출력
		//Semaphore 클래스를 이용해서 동시에 출력할 스레드 수를 조절할 수 있음
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
		
	}

}
