package api.lang.wrapper_2;

import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PersonVO[] persons = {
				new PersonVO(25, "이이"),
				new PersonVO(20, "김김"),
				new PersonVO(30, "박박")
		};

		/*
		 * Arrays.sort 메서드는 배열을 대입하면 부등호 또는 compareTo 메서드를 자동으로
		 * 호출해서 크기 비교를 한 후 정렬을 수행
		 */
		//sort호출 시 ( ) 클래스 안에 있는 compareTo 메서드를 자동으로 호출, 따로 호출하지 않아도 실행됨
		//		Arrays.sort(persons); //PersonVO에 크기 비교를 할 수 있는 메서드가 존재하지 않기 때문에 예외 발생

		//동적으로 크기를 비교하는 메서드
		//		Arrays.sort(persons, new Comparator<PersonVO>() {
		//			
		//			public int compare(PersonVO o1, PersonVO o2) {
		////				return o1.getAge() - o2.getAge(); //오름차순
		//				return o2.getAge() - o1.getAge(); //내림차순
		//		//			}
		//		//		});
		//
		//1. 이름의 오름차순 / 2. 이름의 내림차순 / 3. 나이의 오름차순 / 4. 나이의 내림차순
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬 [A. 이름 오름차순] [B. 이름 내림차순] [C. 나이 오름차순] [D. 나이 내림차순] >");
		String s = sc.nextLine();
		switch (s.trim().toUpperCase()) {
		case "A":
			Arrays.sort(persons, new Comparator<PersonVO>() {

				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			});
			System.out.println("이름 오름차순");
			break;
		case "B":
			Arrays.sort(persons, new Comparator<PersonVO>() {

				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getName().compareTo(o1.getName());
				}
				
			});
			System.out.println("이름 내림차순");
			break;
		case "C":
			Arrays.sort(persons, new Comparator<PersonVO>() {

				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getAge() - o2.getAge();
				}
				
			});
			System.out.println("나이 오름차순");
			break;
		case "D":
			Arrays.sort(persons, new Comparator<PersonVO>() {

				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getAge() - o1.getAge();
				}
				
			});
			System.out.println("나이 내림차순");
			break;
		default:
			System.out.println("A, B, C, D 중에서 입력");
		break;
		}
		
		/*
		 * Arrays.toString 메서드는 배열의 각 요소의 toString을 전부 호출해서
		 * 하나의 문자열로 리턴하는 메서드
		 */
		System.out.println(Arrays.toString(persons));
		
		String s1 = "a";
		String s2 = "b";
		System.out.println(s2.compareTo(s1));
		
	}

}
