package api.lang.wrapper_2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 문자열을 입력받아서 정수 타입으로 변경하고 출력하는 프로그램
		System.out.print("정수 입력>");
		String st = sc.nextLine();
		
		try {
			//문자열을 정수로 변환
			Integer i = Integer.parseInt(st);
			Long j = Long.parseLong(st);
			
			//정수를 문자열로 변환
			String str = i.toString();
			String str1 = j.toString();
			System.out.println(str);
			System.out.println(str1);
		} catch (Exception e) {
			System.out.println("변환에 실패");
		}
		
		sc.close();
	}

}
