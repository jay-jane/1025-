package api.util.random;

import java.util.Random;
import java.util.UUID;

public class RandomTest {
	public static void main(String[] args) {
		
		//seed를 사용하지 않는 경우와 사용하는 경우의 차이
		//여러 번 실행해보고 확인
		Random r = new Random();
		System.out.println(r.nextInt());
		
		//seed를 설정하면 고정된 패턴의 숫자를 리턴함
		r = new Random(42);
		System.out.println(r.nextInt());
		
		r = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(6) + 1);
		}
		
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm");
		r = new Random();
		int[] arr = {-1,2,3,4,5};
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[r.nextInt(arr.length)]);
		}
		
		System.out.println(r.nextBoolean());
		
		//랜덤한 문자열 추출
		System.out.println(UUID.randomUUID().toString());
		
	}

}
