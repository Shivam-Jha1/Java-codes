package Linked_List;

public class QueueUse {
	public static void main(String[] args) throws StackFullException, WrongIndexException {
		QueueUsingArray queue = new QueueUsingArray(5);
		
		int[] arr = {2,3,5,6,9,11,12,13,14};
		for(int elem:arr) {
			queue.enqueue(elem);
		}
		int i = 5;
		while(i>=2) {
			System.out.println(queue.dequeue());
			i--;
		}
		
		
//		queue.enqueue(10);
//		queue.enqueue(5);
//		queue.enqueue(5);
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.enqueue(12);
	//	queue.dequeue();
		System.out.println("size"+queue.size());
		System.out.println(queue.front());
		
	}
}
