package api.lang.wrapper;

public class AutoBoxing {
	public static void main(String[] args) {
		
		//AutoBoxing - 자동 형 변환
		int a = 100;
		Integer val = a; //기본타입 -> 객체형
		a = val; //객체형 -> 기본타입
		
		Object[] arr = {1,2,3}; //자동형변환됨
		
		//parse
		Integer.parseInt("1"); //문자열을 정수형으로 바꿔줌
		
		int n1 = Integer.parseInt("3");
		int n2 = Integer.parseInt("54");
		double n3 = Double.parseDouble("3.14");
		long n4 = Long.parseLong("10000000000");
		
		System.out.println(n1 + n2 + n3 + n4);
		
	}
}
