package gmail.sk223r5.generics;

public class Abc<T> { //제네릭 - 클래스 안에서 타입처럼 사용됨
	
	private T a; //타입 미정, Abc 객체를 생성할 때 타입을 지정한다
	
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	

}
