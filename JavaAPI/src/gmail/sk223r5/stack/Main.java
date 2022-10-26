package gmail.sk223r5.stack;

import java.util.Date;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 Stack 생성
		Stack<PersonVO> stk = new Stack<>();
		
		//Stack에 데이터 저장 - push
		stk.push(new PersonVO(1, "이이", new Date(1994, 2, 3, 14, 0 , 0), "01012341234"));
		stk.push(new PersonVO(2, "김김", new Date(1995, 11, 10, 18, 0 , 0), "01043214321"));
		
		//Stack에서 데이터 꺼내기 - pop
		System.out.println(stk.pop());
		System.out.println(stk.pop());
//		System.out.println(stk.pop()); //StackUnderFlow : 데이터가 없는데 불러오려고 할 때
	}

}
