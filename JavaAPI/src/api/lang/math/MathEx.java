package api.lang.math;

public class MathEx {
	public static void main(String[] args) {
		
		//ceil - 올림
		double d = Math.ceil(1.3);
		System.out.println(d);
		
		//floor - 내림
		double d1 = Math.floor(1.3);
		System.out.println(d1);
		
		//round - 반올림
		double d2 = Math.round(1.5);
		System.out.println(d2);
		
		//sqrt - 루트값
		double d3 = Math.sqrt(16);
		System.out.println(d3);
		
		//abs - 절대값
		double d4 = Math.abs(-2.8);
		System.out.println(d4);
		
		//max, min - 비교 - 큰 값, 작은 값
		int i = Math.max(5, 3);
		System.out.println(i);
		
		int i1 = Math.min(5, 3);
		System.out.println(i1);
	}
}
