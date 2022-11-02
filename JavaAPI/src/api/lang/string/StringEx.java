package api.lang.string;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		
		String s = "홍길동";
		
		char c = s.charAt(2);
		System.out.println(c);
		
		//indexOf() - 괄호 안의 문자를 찾으면 위치 반환, 못찾으면 -1 반환
		int i = s.indexOf("길");
		System.out.println("길의 위치 : " + i);
		
		//replace()
//		String r = s.replace('길', '임'); //char형으로 쓸 수도 있음
		String r = s.replace("길", "");
		System.out.println(r);
		System.out.println("원본 : " + s); //원본은 바뀌지 않음
		//바꾸려면 s = s.replace("길", "");
		CharSequence cs = "김김"; //문자열
		
		//substring() - 문자열 자르기
		String s2 = "오늘은 날씨가 추워요";
		String r2 = s2.substring(4); //4미만 자르고 추출
		System.out.println(r2);
		
		String r3 = s2.substring(4, 7); //4이상 7미만 추출
		System.out.println(r3);
		
		//.trim() - 앞뒤 공백 제거
		System.out.println("      이이이  ".trim());
		
		//split* - 문자열 자르기
		String[] arr = s2.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//split - 배열의 크기 제한
		String[] arr1 = "010-1234-5678".split("-", 2); // "-"를 기준으로 잘랐을 때 최대 인덱스 값 2
		System.out.println(Arrays.toString(arr1));
		
		
		//contains - 문자열 포함 여부
		if(s.contains("이")) {
			System.out.println("홍 이 포함됨");
		} else System.out.println("안됨");
		
		
		//String클래스의 static메소드
		String cv = String.copyValueOf(new char[] {'a', 'b', 'c'}); //매개변수에 배열이 들어갈 경우 이런 식으로 입력 가능
		System.out.println(cv);
		
		String v = String.valueOf(4); //받은 값을 문자열로 반환
		
	}

}
