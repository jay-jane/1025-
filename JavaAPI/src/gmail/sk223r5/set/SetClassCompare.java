package gmail.sk223r5.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	public static void main(String[] args) {
		
		Set<String> hash = new HashSet<>();
		Set<String> linkedHash = new LinkedHashSet<>();
		Set<String> tree = new TreeSet<>();
		
		hash.add("김김");
		linkedHash.add("김김");
		tree.add("김김");
		
		hash.add("20");
		linkedHash.add("20");
		tree.add("20");
		
		hash.add("AA");
		linkedHash.add("AA");
		tree.add("AA");
		System.out.println(hash.toString()); //순서 알 수 없음
		System.out.println(linkedHash.toString()); //입력한 순서대로 출력
		
		//오름차순 출력, 크기 : 숫자 < 대문자 < 소문자
		System.out.println(tree.toString());
		
		for(String s : hash) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for(String s : linkedHash) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for(String s : tree) {
			System.out.print(s + "\t");
		}
		
	}

}
