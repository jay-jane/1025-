package api.util.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Collection2 {
	
	public static void main(String[] args) {
		
		ArrayList <String> a1 = new ArrayList<>();
		
		a1.add("one");
		a1.add("three");
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			a1.add(1, "two");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		LinkedList<String> a2 = new LinkedList<>();
		
		a2.add("one");
		a2.add("three");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			a2.add(1, "two");
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
//		System.out.println(a2); //배열값 출력
		System.out.println(a2.get(100001));
		
		//출력 메소드에 instance 변수를 넣으면 자동으로 toString 호출
//		System.out.println(a2);
//		System.out.println(a2.toString());
	}

}
