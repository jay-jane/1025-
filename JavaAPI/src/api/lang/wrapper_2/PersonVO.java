package api.lang.wrapper_2;

public class PersonVO implements Comparable<PersonVO> { //Value Object
	private int age;
	private String name;
	
	//매개변수가 없는 생성자 - Default Constructor
	public PersonVO() {
		super();
	}

	//속성을 전부 매개변수로 받는 생성자 - 인스턴스 생성 후 값을 빠르게 대입하려는 목적
	public PersonVO(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	//toString 메서드 : 데이터 출력을 편하게 하려는 목적
	//출력 메서드에 인스턴스 이름을 넣으면 이 메서드가 자동 호출되서 출력
	public String toString() { //출력 메서드에 해당(PersonVO) 객체를 대입하면 자동으로 호출됨
		return "PersonVO [age=" + age + ", name=" + name + "]";
	}

	//getter, setter - 속성의 값에 접근/변경하기 위한 메서드
	//일반적으로 VO 클래스의 경우에는 setter를 만들지 않음
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	//comparTo 메서드 - 크기를 비교하는 메서드, 정렬하기 위해 사용
	public int compareTo(PersonVO p) { 
		//크기 비교 방법 설정 ( 문자열 비교 시 양수:앞이 더 큼, 0:같음, 음수:뒤가 더 큼 )
		return this.name.compareTo(p.name); //문자열 오름차순
//		return )p.name.compareTo(this.name; //문자열 내림차순
//		return this.name.compareTo(p.name) * -1; //문자열 내림차순
//		return this.age - p.age; //정수 오름차순
//		return p.age - this.age; //정수 내림차순
	}

}
