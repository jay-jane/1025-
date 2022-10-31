package gmail.sk223r5.thread;

public class Consumer extends Thread {
	public Product myList;
	
	public Consumer(Product myList) {
		this.myList = myList;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 26; i++) {
			myList.get();
		}
	}

}
