package gmail.sk223r5.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

interface Sample { //메서드가 하나인 인터페이스
	//추상 메서드 선언
	public void abs();
}

//인터페이스를 구현한 클래스
class SampleImp1 implements Sample {

	@Override
	public void abs() {
		System.out.println("추상메서드 오버라이드");
	}
}

public class AnonymousMain {
	public static void main(String[] args) {
		
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		Sample s = new SampleImp1();
		s.abs();
		
		//Sample 인터페이스를 Anonymous로 사용
		//인스턴스가 하나만 필요할 때 클래스를 만들지 않고 이렇게 쓰는 것이 효율적임
		new Sample() {
			public void abs() {
				System.out.println("AnonymousClass");
			}
		}.abs();
		
		//배열의 정렬
		String[] ar = {"이이", "김김", "박박"};
		
		//내림차순
		//Arrays.sort(배열, Comparator<T> 인터페이스를 구현한 클래스의 객체)
		Arrays.sort(ar, new Comparator<String>() { //여기에서 한 번만 쓰이기 때문에 anonymous를 사용함
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(ar));
		
		//하나씩 확인
		for(String i : ar) {
			System.out.println(i);
		}
	}
}
