package gmail.sk223r5.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Map<String, Object> m = new HashMap<>();
		
		m.put("num", 1);
		m.put("name", "이이");
		m.put("job", "백수");
		m.put("job", "학생"); //같은 키 값에 데이터를 입력하면 이전 데이터가 삭제되고 수정됨
		
		System.out.println(m);
		
		//Map에서 데이터 가져오기
		System.out.println(m.get("name"));
		System.out.println(m.get("job"));
		
		//존재하지않는 key를 호출하면 null을 리턴함
		System.out.println(m.get("ㅁㄴㅇㄹ"));
		System.out.println(m.get("age"));
		
//		m.remove("job");
//		System.out.println(m.get("job"));
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터에 접근할 수 있음
		//모든 key에 접근할 수 있는 Set 가져오기
		Set<String> keys = m.keySet();
		
		for(String s : keys) {
			System.out.println(s + " : " + m.get(s));
		}
		
	}

}
