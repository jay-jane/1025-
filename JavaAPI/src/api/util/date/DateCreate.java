package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCreate {
	
	public static void main(String[] args) {
		
		//현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성
		Date first = new Date(94, 2, 3, 14, 0, 0); //년도에서 -1900, 월에서 -1
		System.out.println(first);
		
		//getter로 년도만 추출해서 출력
		System.out.println(first.getYear() + 1900);
		
		//원하는 포맷으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일 h시 m분 ss초");
		System.out.println(sdf.format(first));
		
		//년월일을 비교해서 년월일이 같으면 시간, 그렇지 않으면 년월일을 출력
		Date second = new Date(94, 2, 3);
		System.out.println(second);
		
		
	}
	
	public static void comp(Date a, Date b) {
		
	}

}
