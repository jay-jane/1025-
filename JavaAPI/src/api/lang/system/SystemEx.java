package api.lang.system;

public class SystemEx {
	public static void main(String[] args) {
		
//		System.exit(0);
//		System.gc();
		
		//currentTimeMillis() - 1970/1/1 부터 현재까지 지나온 시간을 밀리초로 표현해줌
		long start = System.currentTimeMillis();
//		System.out.println(start);
		
		long sum = 0;
		for(long i =1; i <= 10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
//		System.out.println(end);
		
		
		System.out.println((end - start) * 0.001 + "초 소요됨");
	}

}
