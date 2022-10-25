package api.lang.sb;

public class StringTest {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i = 1; i < 300000; i++) {
//			str += "A";
//		}
		
		//처리속도가 빠름
		StringBuffer sb = new StringBuffer("");
		for(int i = 1; i < 300000; i++) {
			sb.append("A");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) * 0.001);
	}
}
