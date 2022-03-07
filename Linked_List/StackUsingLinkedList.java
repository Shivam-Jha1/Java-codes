package Linked_List;

public class StackUsingLinkedList <T>{
	Node<T> head;
	private int size;

	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public boolean isEmpty(){
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public T pop() {
		T temp = head.data;
		head = head.next;
		size--;
		return temp;

	}

	public T top() {
		return head.data;
	}

	public int size() {
		return size;
	}
}
