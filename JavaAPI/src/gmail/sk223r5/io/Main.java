package gmail.sk223r5.io;

import java.io.File;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//파일에 대한 정보 확인
		try {
			/*File 인스턴스 생성
			 *Windows의 디렉토리 구분기호는 \임
			 *프로그래밍 언어에서 \바로 뒤의 문자는 제어문자로 인식하기 때문에 \를 입력하고자 할 때 두 번(\\)입력해야 함
			 */
			File f = new File("C:\\Users\\user\\Desktop\\수업자료\\자바\\18강 예외처리.txt");

			//파일의 존재 여부 확인
			System.out.println(f.exists()); //exists : 파일이 존재하면 true, 없으면 false
			
			//마지막 수정 날짜
			System.out.println(f.lastModified());
			System.out.println(new Date(f.lastModified()));

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
		
	}

}
