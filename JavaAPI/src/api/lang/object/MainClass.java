package api.lang.object;

public class MainClass {
	public static void main(String[] args) {
		
		//toString() - 많이 사용함***
		Person p = new Person("이이이");
		/*
		 * toString을 직접 호출하지 않아도 객체를 sysout으로 호출하면 
		 * 자동으로 toString이 호출되도록 약속됨
		 */
		System.out.println(p);
		System.out.println(p.toString());
		
		//equals()
		Person p1 = new Person("이이이");
		System.out.println(p.equals(p1));
		
		
		try {
			Object obj = p.clone();
			Person p2 = (Person) obj;
			System.out.println("복사된 객체의 이름 : " + p2.getName());
			System.out.println(p2 == p); //서로 다른 객체임
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
