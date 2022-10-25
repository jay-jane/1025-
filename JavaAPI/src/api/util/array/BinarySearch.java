package api.util.array;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] phones = {"애플", "삼성", "LG", "샤오미"};
		
		//이분 검색 수행
		int result = Arrays.binarySearch(phones, "애플");
		//System.out.println(result); - sort(정렬)을 하지 않아서 잘못된 결과가 리턴됨.
		
		//데이터 정렬
		Arrays.sort(phones);
		System.out.println(Arrays.toString(phones));
		result = Arrays.binarySearch(phones, "애플");
		if(result >= 0) {
			System.out.printf("%s 은/는 %d 번쨰 존재\n", "애플", (result+1));
		}else {
			System.out.printf("%s 은/는 존재하지 않음\n", "애플");
		}
		
	}
}