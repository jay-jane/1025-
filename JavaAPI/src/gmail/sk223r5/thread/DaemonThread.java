package gmail.sk223r5.thread;

public class DaemonThread {
	public static void main(String[] args) {
		
		Thread th = new Thread(() -> {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		//데몬스레드 설정 - 다른 작업이 없으면 자동으로 종료
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("메인 종료");
		} catch (Exception e2) {
			System.out.println(e2.getLocalizedMessage());
		}
		
	}
}
