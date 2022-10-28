package gmail.sk223r5.io;

import java.io.Serializable;
import java.util.Date;

public class MemberDTO implements Serializable { //인스턴스 단위로 읽고 쓰기 가능한 클래스 - Serializable인터페이스
	private String name;
	private int age;
	private Date birthday;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String name, int age, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	
	
	

}
