package api.util.array;

import java.util.Arrays;

public class Collection {
	public static void main(String[] args) {
		
		String[] ar = {"a", "b", "c"};
		
		//ar배열에 데이터를 추가하고 싶다면
		String[] ar2 = new String[ar.length + 1]; //새 배열 생성
		for(int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i]; //배열값 복사
		}
		ar2[ar2.length - 1] = "d"; //데이터 추가
		ar = ar2; //새 배열을 원 배열에 덮어씌우기
		System.out.println(Arrays.toString(ar));
		
		//ar배열에 데이터를 삭제하고 싶다면
		String[] ar3 = new String[ar.length - 2];
		for(int i = 0; i < ar3.length; i++) {
			ar3[i] = ar[i];
			if(i == 1) {
				ar3[i] = ar[i + 1];
			}
		}
		ar = ar3;
		System.out.println(Arrays.toString(ar));
	}

}
