package api.util.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 1; i <= 100000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 1; i <= 100000; i++) {
			li.add(i);
		}
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			System.out.println(al.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
