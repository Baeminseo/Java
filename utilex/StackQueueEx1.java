package utilex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO 자료구조로 Stack 클래스가 정의 되어 있다. push/pop 을 이용해서 입출한다. Undo/Redo 같은곳에 사용됨.
 * Queue : FIFO 자료구조로 Queue 인터페이스를 구현한 LinkedList 를 이용해서 작업한다. offer/poll 을 이용해서 입출한다. 최근사용문서나, 인쇄작업 대기목록 같은데 사용됨.
 */

public class StackQueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack  = new Stack();
		Queue q = new LinkedList();
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==stack==");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("==Queue==");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		
	}

}
