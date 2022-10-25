package api.lang.wrapper_2;

import java.util.Arrays;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		//문자열 배열
		String[] arr = {"이이", "김김", "박박", "임임", "슬기"};
		
		//배열의 순회
		for(String s : arr) {
			System.out.println(s);
		}
		
		//compareTo, compareToIgnorecase : 문자열의 크기 비교 메서드
		System.out.println(arr[0].compareTo(arr[0]));
		System.out.println(arr[0].compareTo(arr[1]));
		
		
		//배열 복제
		String[] copyArr = Arrays.copyOf(arr, arr.length);
		
		//선택 정렬
		for(int i = 0; i < copyArr.length; i++) {
			for(int j = i + 1; j < copyArr.length; j++) {
				if(copyArr[i].compareTo(copyArr[j]) < 0) {
					String temp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = temp;
				}
			}
		}
		for(String s : copyArr) {
			System.out.println(s);
		}
	}

}
