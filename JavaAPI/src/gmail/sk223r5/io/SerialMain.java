package gmail.sk223r5.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SerialMain {
	public static void main(String[] args) {
		
		try(//인스턴스 단위로 파일에 기록할 수 있는 객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.txt"));) {			
			
			//기록할 인스턴스 생성
			MemberDTO dto = new MemberDTO("이이이", 29, new Date(94, 2, 3, 14, 0, 0));
			MemberDTO dto2 = new MemberDTO("김김", 28, new Date(95, 11, 10, 18, 0, 0));
			
			
			//기록할 인스턴스가 여러 개일 때 List로 묶어줌
			ArrayList<MemberDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
			
//			oos.close(); //try( ) 괄호 안에 AutoCloseable인터페이스를 implements하는 객체가 있으면 close구문 생략 가능
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.txt"));) {
			
			ArrayList list = (ArrayList)ois.readObject();

			for(Object obj : list) {
				System.out.println(obj);
			}
			
//			ois.close(); //눈으로 보이는 효과는 없음, 메모리 누수 방지
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
