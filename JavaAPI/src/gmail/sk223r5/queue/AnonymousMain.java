package gmail.sk223r5.queue;

public class AnonymousMain {
	public static void main(String[] args) {

		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드 호출
		Protos p = new Protos();
		p.attack();

		//클래스를 만들지 않고 인스턴스를 생성해서 메서드 호출, { } 사용
		Star z = new Star() {
			public void attack() {
				System.out.println("저그");
			}
		};
		z.attack();
		
		
		//다형성
		Star star = new Protos();
		p.attack();
		
		star = new Star() {
			public void attack() {
				System.out.println("저그");
			}
		};
		star.attack();
		
		
		//변수를 쓰지 않고 인스턴스만 생성해서 메서드 호출
		new Star() {
			public void attack() {
				System.out.println("테란");
			}
		}.attack();
	}
}

interface Star {
	public void attack();
}

class Protos implements Star {
	public void attack() {
		System.out.println("프로토스");
	}

}
