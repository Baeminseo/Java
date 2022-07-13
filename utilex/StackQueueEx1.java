package utilex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO �ڷᱸ���� Stack Ŭ������ ���� �Ǿ� �ִ�. push/pop �� �̿��ؼ� �����Ѵ�. Undo/Redo �������� ����.
 * Queue : FIFO �ڷᱸ���� Queue �������̽��� ������ LinkedList �� �̿��ؼ� �۾��Ѵ�. offer/poll �� �̿��ؼ� �����Ѵ�. �ֱٻ�빮����, �μ��۾� ����� ������ ����.
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
