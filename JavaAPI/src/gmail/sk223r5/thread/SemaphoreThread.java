package gmail.sk223r5.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreThread implements Runnable {
	
	String message;
	Semaphore semaphore;
	
	public SemaphoreThread(String message, Semaphore semaphore) {
		this.message = message;
		this.semaphore = semaphore;
	}
	
	@Override
	public void run() {
		try {
			semaphore.acquire(); //리소스 확보
			Thread.sleep(1000);
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		semaphore.release(); //리소스 해제
	}

}
