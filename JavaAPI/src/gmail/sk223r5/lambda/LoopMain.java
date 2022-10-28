package gmail.sk223r5.lambda;

import java.util.ArrayList;

public class LoopMain {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");
		
		//전체 데이터 출력
		System.out.println(list.get(0)); //속도는 가장 빠름
		System.out.println(list.get(1)); //값이 변경될 때
		System.out.println(list.get(2)); // 일일히 수정해야 함
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//변하지 않는 메서드의 호출 결과를 여러 번 호출하는 것은 비효율적임
		int leng = list.size(); //변수로 만들어 쓰는 것이 더 빠름
		for(int i = 0; i < leng; i++) {
			System.out.println(list.get(i));
		}
		
		//빠른 열거 - 반복자를 외부에 만들어서 사용
		for(String s : list) {
			System.out.println(s);
		}
		
		//Stram API - 내부 반복자를 사용, 더 효율적임
		list.stream().forEach(s -> {
			System.out.println(s);
		});
		
	}
}
