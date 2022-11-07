package gmail.sk223r5.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		
		//멀티 제네릭 클래스
		Map<Long, String> m = new HashMap<>();
		
		m.put(29L, "이이이");
		m.put(30L, "김김");
		m.put(31L, "박박");
		m.put(31L, "금금");
		System.out.println(m);
		
		System.out.println(m.get(31L));
		System.out.println(m.get(32L));
		
		//Map의 반복
		Set<Entry<Long, String>> entSet = m.entrySet();
		for(Entry<Long, String> e : entSet) {
			System.out.println(e);
//			System.out.println(e.getKey()); //key값만 추출
//			System.out.println(e.getValue()); //value값만 추출
		}
		
		//모든 Key에 접근할 수 있는 Set 가져오기, 위와 같은 기능
		Set<Long> keys = m.keySet();
		for(Long l : keys) {
			System.out.println(l + " = " + m.get(l));
		}
		
	}
}
