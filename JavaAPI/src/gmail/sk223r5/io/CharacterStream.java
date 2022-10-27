package gmail.sk223r5.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CharacterStream {
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//파일에서 문자열을 문자단위로 기록하기 - 문자단위 > Character > FileWriter, PrintWriter 이용
		try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 인스턴스를 생성
			//true - 이어서 작성, false - 항상 새로 작성(덮어 씌움)
			PrintWriter pw = new PrintWriter(new FileWriter("ch.txt", true));
			
			//문자열을 기록할 때 ,(쉼표)나 공백 및 탭 등으로 구분 가능 - csv
			//csv - 변하지 않는 고정적인 데이터를 기록할 때 주로 씀
			pw.print("안,녕\t" + sdf.format(date) + "\n");
			pw.print("잘 가\t" + sdf.format(date) + "\n");
			
			//버퍼의 내용을 전부 출력
			pw.flush();
			
			pw.close();
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//파일에서 문자열을 문자 단위로 읽어오기 - FileReader, BufferedReader 이용
		try {
			//문자 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
			BufferedReader br = new BufferedReader(new FileReader("./ch.txt"));
			
			//줄 단위로 읽어서 출력하기
			while(true) {
				
				//한 줄 읽기
				String line = br.readLine();
				
				//읽은 데이터가 없으면(null) 종료
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		String str = "금금금,은은은,동동동";
		String[] a = str.split(",");
		System.out.println(a[a.length - 1]);
		
	}
}
