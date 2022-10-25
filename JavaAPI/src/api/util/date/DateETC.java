package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {
	public static void main(String[] args) {
		
		//날짜와 시간을 다른 형태로 이용하는 클래스
		Calendar c = new GregorianCalendar();
		
		c.set(1994, 3, 3);
		//Date보다 많은 정보를 출력
		System.out.println(c);
		
		//특정한 데이터 조회 - 년도 추출
		System.out.println(c.get(Calendar.MONTH));
		
		//LocalDateTime - 최근에 많이 사용하는 날짜 타입, 월에 -1 할 필요 없음
		LocalDateTime loc = LocalDateTime.of(2022, 10, 25, 11, 31);
		System.out.println(loc);
		
		//Calendar 클래스나 LocalDateTime클래스에서 지역이나 시간대 설정하기
		//Calendar 클래스나 LocalDateTime클래스에서 시간의 연산하기 (뺄셈*)
		
		
		
	}

}
