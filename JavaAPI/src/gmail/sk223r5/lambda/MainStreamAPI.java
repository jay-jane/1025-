package gmail.sk223r5.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class MainStreamAPI {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("21");
		list.add("3");
		list.add("4");
		list.add("2");
		list.add("5");

		/*
		 * 최종작업 forEach
		 *forEach는 매개변수 1개를 갖고 리턴이 없는 메서드를 매개변수로 받음
		 *Collection의 모든 데이터를 매개변수에 대입해서 내용을 수행
		 *list 안의 데이터를 순차적으로 s에 대입해서 { }안의 내용을 수행
		 */
//				list.stream().forEach(s -> {System.out.println(s);});

		//데이터를 3개만 출력하기 - 중간작업 limit
//				list.stream().limit(3).forEach(s -> {System.out.println(s);});

		//데이터 정렬 후 출력
		list.stream().sorted().forEach(s -> {System.out.println(s);}); //오름차순

		/*
		 * 내림차순 정렬
		 * sorted 메서드에 Comparator 인터페이스를 구현한 클래스의 객체를 설정
		 * Comparator 인터페이스에는 매개변수가 2개이고 정수를 리턴하는 메서드 1개만 존재함
		 */
		list.stream().sorted(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		}).forEach(s -> {System.out.println(s);});
		
		list.stream()
		.sorted((o1, o2) -> o2.compareTo(o1))
		.forEach(s -> {System.out.println(s);});
		
		//데이터를 정수로 변환해서 내림차순 정렬
		//숫자의 경우 크기 비교가 가능하므로 별도의 인스턴스를 대입하지 않아도 됨
		//내림차순을 하고자 할 때 reverseOrder 메서드 사용
		list.stream()
		.map(Integer::parseInt)
		.sorted(Comparator.reverseOrder())
		.forEach(s -> {System.out.println(s);});
		
		//홀수의 합
		int result = list.stream()
				.mapToInt(Integer::parseInt)
				.filter(s -> s % 2 == 1)
				.sum();
		System.out.println(result);
		
		//홀수의 평균
		/*
		 * 평균의 결과 = OptionalDouble
		 * Optional이 붙으면 null을 저장할 수 있는 자료형이 됨
		 * isPresent 메서드를 사용해서 null 여부를 판단하고 get 메서드로 데이터를 가져온다
		 */
		OptionalDouble result2 = list.stream()
		.mapToInt(Integer::parseInt)
		.filter(s -> s % 2 == 1)
		.average();
		
		//연산 출력
		if(result2.isPresent()) {
			System.out.println(result2.getAsDouble());
		} else {
			System.out.println("실패");
		}
		
	}
}


