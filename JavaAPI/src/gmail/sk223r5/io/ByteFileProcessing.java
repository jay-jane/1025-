package gmail.sk223r5.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ByteFileProcessing {
	public static void main(String[] args) {
		
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록할 파일 생성
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\user\\git\\1025-\\" + sdf.format(date) + ".txt", true);
			
			//기록할 메시지 생성
			String msg = "IO - InputStream, OutputStream\t" + sdf.format(date) + "\n";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일 닫기*
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\git\\1025-\\2022-10-27.txt");
			
			//읽어서 저장할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			
			//읽기
			fis.read(b);
			
			//읽은 내용 확인
			System.out.println(new String(b)); //byte배열을 문자로 바꾸기 위해 new String( )을 써줌
			
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
