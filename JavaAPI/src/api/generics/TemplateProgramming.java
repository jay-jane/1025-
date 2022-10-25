package api.generics;

class Algorithm { //로직은 같으나 매개변수의 자료형이 달라 오버로딩을 이용해서 구현한 클래스
	
	//정수 2개를 더해서 결과 리턴
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	//실수 2개 더하기 //메소드 오버로딩(Overloading)
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
}

class Algorithm1 <t> { 
	/*
	 * 자료형의 이름을 임시로 만들어 두고 내부에서 임시로 만든 자료형을 사용한 후 
	 * 인스턴스를 생성할 때 자료형을 결정하는 방식
	 * 	단, 인스턴스를 만들 때 또는 메서드를 호출할 때 실제 자료형을 기재해야 함
	 * 		이 때 사용되는 자료형은 Object로부터 상속받은 클래스의 자료형만 가능
	 * 		int같은 primitive type의 경우 Integer같은 Wrapper클래스를 사용해야 함
	 * 
	 * 미지정 자료형의 개수는 제한이 없음
	 * 인스턴스를 만들 때 자료형을 지정하지 않으면 경고 발생
	 */
	public void swap(t n1, t n2) {
		t temp = n1;
		n1 = n2;
		n2 = temp;
	}
}

class Generics <U> { //어떤 종류의 데이터든지 갯수에 상관 없이 생성자에서 받아서 처리하는 클래스
	private U[] data;
	
	// ...은 variable args로 갯수에 상관없이 매개변수를 받고자 할 때 사용
	//	받은 매개변수들은 배열로 만들어진다
	public Generics(U ... n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void print() {
		for(U i : data) {
			System.out.println(i);
		}
	}
	
}

public class TemplateProgramming {
	public static void main(String[] args) {
		
		//제너릭이 적용된 클래스의 인스턴스를 만들 때에는 자료형을 기재해야 함
		//자료형을 기재하지 않으면 경고가 발생하고 Object 타입으로 간주함
		Algorithm1 <Integer> al = new Algorithm1<>();
		Integer n1 = 20;
		Integer n2 = 30;
		al.swap(n1, n2);
		System.out.printf("%d, %d", n1, n2);
		
		System.out.println("\nmmmmmmmmmmmmmmmmmmmmmm");
		
		Generics <String> a1 = new Generics<String>("이이", "김김", "박박");
		a1.print();
		Generics <Integer> a2 = new Generics<>(1, 2, 3, 4, 5);
		a2.print();
		Generics <Character> a3 = new Generics<Character>('a', 'b', 'c');
		a3.print();
		Generics <Boolean> a4 = new Generics<Boolean>("a".equals("b"));
		a4.print();
		
		 
	}

}
