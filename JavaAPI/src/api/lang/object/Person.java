package api.lang.object;

public class Person /* extends Object */ implements Cloneable {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//toString 오버라이딩 - generate toString()
	//객체의 멤버변수를 찍어주는 역할
	public String toString() {
		return "Person [name=" + name + "]";
	}

	//equals 오버라이딩
	public boolean equals(Object obj) {
		//객체 instanceof 클래스
		if(obj instanceof Person) { //instanceof - 객체 타입을 확인하는 연산자, 형변환 가능 여부 확인, 결과는 true/false 반환
			Person p = (Person)obj;
			
			String n = p.getName();
			
			if(n.equals(this.name)) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		return false;
	}

	//clone() - 객체 복사 메서드
	//protected -> 오버라이딩해야 사용할 수 있음
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
