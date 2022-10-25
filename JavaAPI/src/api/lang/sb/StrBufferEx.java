package api.lang.sb;

public class StrBufferEx {
	public static void main(String[] args) {
		
		String str = new String("a"); //String 생성
		StringBuffer sb = new StringBuffer("a");
		System.out.println(str);
		System.out.println(sb);
		
		str = str + "Program"; //문자열, 새로운 값을 다시 저장 > 새로운 객체 생성, 느림
		sb.append("Program"); //버퍼클래스, 뒤에 글자만 붙임 > 기존 객체 재활용, 빠름
		System.out.println(str);
		System.out.println(sb);
		
		//toString - 문자열로 형 변환
		System.out.println(str.equals(sb));
		String sb1 = sb.toString();
		System.out.println(str.equals(sb1));
		
		//append - 기존 문자열 마지막에 추가
		sb.append("마지막에 추가");
		System.out.println(sb);
		
		//insert - 기존 문자열 중간에 추가
		sb.insert(8, " (중간에) ");
		System.out.println(sb);
		
		//replace - 기존 문자열 변경 (a이상, b미만)
		sb.replace(0, 8, "변경됨");
		System.out.println(sb);
		
		//delete - 기존 문자열 삭제 (a이상, b미만)
		sb.delete(0, 3);
		System.out.println(sb);
		
		//reverse - 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
	}
}
