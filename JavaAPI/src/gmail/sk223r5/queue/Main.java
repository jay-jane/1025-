package gmail.sk223r5.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import gmail.sk223r5.stack.PersonVO;

public class Main {
	public static void main(String[] args) {
		
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQue = new PriorityQueue<>();
		
		intQue.offer(1);
		intQue.offer(3);
		intQue.offer(8);
		intQue.offer(2);
		System.out.println(intQue.toString());
		
		try {
			System.out.println(intQue.poll());
			System.out.println(intQue.poll());
			System.out.println(intQue.poll());
			System.out.println(intQue.poll());
			System.out.println(intQue.poll());
		} catch (Exception e) {
			System.out.println("dd");
		}
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		PriorityQueue<PersonVO> persons = 
				new PriorityQueue<>(new Comparator<PersonVO>() {

					public int compare(PersonVO o1, PersonVO o2) {
						return o2.getBirthday().compareTo(o1.getBirthday());
					}
					
				});
		
		
		persons.offer(new PersonVO(1, "박박", new Date(94, 2, 3, 14, 0, 0), "01012345678"));
		persons.offer(new PersonVO(2, "임임", new Date(99, 0, 1, 12, 30, 0), "01087654321"));
		persons.offer(new PersonVO(3, "이이", new Date(100, 11, 10, 18, 0, 0), "01011112222"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());

		
	}

}
