package gmail.sk223r5.map;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>(); //다형성
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(3); //list2에 값을 추가
		list2.add(4);
		list1.add(1);
		list1.add(2);
		list1.addAll(list2); //list1에 list2객체를 추가
		System.out.println(list1);
		System.out.println(list1.get(0)); //list1의 인덱스( )값을 출력
		System.out.println(list1.get(3));
		System.out.println(list2.get(1));
		System.out.println(list2.size()); //list2의 크기를 출력
		
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.contains(0));
		System.out.println(list1.contains(1));
		
		list1.set(2, 999); // 해당 인덱스의 값 바꾸기
		System.out.println(list1);
		
		list1.forEach(x -> { //람다
			System.out.println(x);
		});
		
		for(int i : list1) { //위와 같은 식
			System.out.println(i);
		}
		
		list1.remove(0);
		System.out.println(list1.get(0));
		System.out.println(list1);
		
	}
}
