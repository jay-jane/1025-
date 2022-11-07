package gmail.sk223r5.generics;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Abc<String> abc = new Abc<>();
		abc.setA("문자열");
		abc.getA(); //String 반환
		System.out.println(abc.getA());
		
		Abc<Integer> def = new Abc<>(); //기본형타입은 쓸 수 없다, int -> Integer
		def.setA(4);
		def.getA(); //int 반환

		Abc<MemberList> jkl = new Abc<>();
		jkl.setA(new MemberList("임임", 30, "010"));
		System.out.println(jkl.getA()); //MemberList 객체 반환
		
		
		ArrayList<MemberList> ghi = new ArrayList<>();
		ghi.add(new MemberList("이이이", 33, "010"));
		ghi.add(new MemberList("박박", 22, "016"));
		System.out.println(ghi);
		
		
		
	}

}
