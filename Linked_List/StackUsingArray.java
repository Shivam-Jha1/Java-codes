package Linked_List;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;
	public StackUsingArray(int size){
		data = new int[size];
		topIndex = -1;
	}

	public void push(int elem) /*throws StackFullException*/{
		
		if(topIndex == data.length-1) {	
		//	StackFullException e = new StackFullException(); 
		//	throw e;
			doubleCapacity();
		}
		data[++topIndex] = elem;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}

	public int pop() throws WrongIndexException {
		if(topIndex == -1) {
			throw new WrongIndexException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	public int top() throws WrongIndexException {
		if(topIndex == -1) {
			throw new WrongIndexException();
		}
		return data[topIndex];
	}
	
	public int size() {
		return topIndex+1;
	}
	
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
