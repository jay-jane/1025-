package gmail.sk223r5.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		//ArrayList 활용
		ArrayList<Integer> al = new ArrayList<>();
		
		while(al.size() < 6) {
			
			//1 ~ 45 까지의 숫자를 랜덤하게 추출
			int ran = r.nextInt(45) + 1;
			
			//중복 검사
			if(al.contains(ran)) {
				continue;
			}
			al.add(ran);
		}
		al.sort(null);
		System.out.println(al);
		
		
		//treeSet - 중복된 데이터 저장 안함, 저장된 순서 기억
		TreeSet<Integer> tree = new TreeSet<>();
		while(tree.size() < 6) { //중복된 데이터를 저장하지 않기 때문에 검사할 필요가 없다
			int ran = r.nextInt(45) + 1;
			tree.add(ran);
		}
		System.out.println(tree);
	}
}
