package gmail.sk223r5.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {

		//properties 인스턴스 생성
		Properties pro = new Properties();

		//없는 key를 사용하면 null 리턴
		System.out.println(pro.getProperty("name"));

		pro.setProperty("이이", "이이이이");
		pro.setProperty("김김", "김김김김");
		pro.setProperty("박박", "박박박박");
		System.out.println(pro.get("이이"));

		//웹서버, 다른 서버와의 통신, DB작업할 때 무조건 예외처리
		//텍스트 파일로 저장
		//현재 작업 디렉토리에 저장됨
		//git에 연결했을 경우 c드라이브의 사용자 디렉토리 안에 내 계정 안에 git 디렉토리에 있음
		try {
			pro.storeToXML(new FileOutputStream("./myproject.xml"), "xml로 저장");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}



	}

}
