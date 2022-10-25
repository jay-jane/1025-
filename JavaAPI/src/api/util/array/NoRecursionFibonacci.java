package api.util.array;

public class NoRecursionFibonacci {

	//n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static Long fibonacci(int n) {
		//이전 항의 값과 이전의 이전 항의 값을 저장 할 변수

		Long f1 = 1L;
		Long f2 = 1L;

		//피보나치 값을 저장할 변수
		Long fibo = 1L;

		//첫번째와 두번째는 처리 할 필요가 없어서 반복분을 세번째 부터 적용
		for(int i = 3; i <= n; i++) {
			fibo = f1 + f2;
			f2 = f1;
			f1 = fibo;
		}
		return fibo;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(100));
	}

}
