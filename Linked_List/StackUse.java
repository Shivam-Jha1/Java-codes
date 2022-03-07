package Linked_List;

public class StackUse {
	public static void main(String[] args) throws StackFullException, WrongIndexException {
		
		//StackUsingArray Stack = new StackUsingArray(1);
		StackUsingLinkedList Stack = new StackUsingLinkedList();
		
		Stack.push(10);
		Stack.push(20);
		System.out.println(Stack.pop());
		Stack.push(50);
		Stack.push(100);
		Stack.push(30);
		System.out.println(Stack.size());
		System.out.println(Stack.top());
		System.out.println(Stack.isEmpty());
	}
}
