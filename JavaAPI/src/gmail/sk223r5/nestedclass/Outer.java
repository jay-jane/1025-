package gmail.sk223r5.nestedclass;

public class Outer {
	
	//Nested Class - 내포 클래스
	class Inner {
		public int num;
	}
	
	/*
	 * 내포 클래스 안에 static멤버가 있으면 인스턴스 생성 없이 사용할 수 있도록 
	 * class 앞에 static을 붙여줘야 함
	 * 	자바 17버전에서는 class 앞에 static을 안 붙여줘도 됨
	 */
	static class StaticInner {
		public int num;
		public static int share;
	}
	
	public void method() {
		
		//Local Inner Class - 메서드 안에 만들어진 클래스
		//메서드 안에서만 사용 가능
		class LocalInner {
			public int num;
		}
	}
	
	
	
}
