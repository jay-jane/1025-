package gmail.sk223r5.generics;

public class MemberList {
	
	String name;
	int age;
	String phoneNum;
	
	public MemberList(String name, int age, String phoneNum) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "MemberList [name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	}
	
}
