package gmail.sk223r5.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteBufferStream {

	public static void main(String[] args) {
		try {
			//버퍼를 이용해서 출력하는 스트림 생성
			PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt"));
			
			ps.print("버퍼를 이용해서 문자열을 출력");
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
