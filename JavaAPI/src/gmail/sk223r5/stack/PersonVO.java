package gmail.sk223r5.stack;

import java.util.Date;
import java.util.GregorianCalendar;

public class PersonVO {
	//여러 개의 값을 묶어서 표현하기 위한 클래스 - Value Object(VO)
	//getter와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
	
	
	//번호, 이름, 생일, 전화번호 저장
	private long number;
	private String name;
	private Date birthday;
	private String phone;
	
	//매개변수가 없는 생성자 - default constructor*
	//NoArgsConstructor
	public PersonVO() {
		super();
	}

	//AllArgsConstructor
	public PersonVO(long number, String name, Date birthday, String phone) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}

	//읽기전용 - setter를 만들지 않음
	public long getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	public String toString() {
		return "PersonVO [number=" + number + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + "]";
	}
	
	
	
}
