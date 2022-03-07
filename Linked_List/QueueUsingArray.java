package Linked_List;

public class QueueUsingArray {
	public int data[];
	public int front;
	public int end;
	public int size;

	public QueueUsingArray() {
		data = new int[3];
		front = -1;
		end = -1;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		end = -1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue (int element) throws StackFullException {
		

		if(size==data.length) {
			doubleSize();
		}

		if(size==1) {
			front=0;
		}
		//		end++;
		//		if(end == data.length) {
		//			end = 0;
		//		}
		end = (end+1)%data.length;
		data[end] = element;

		if(front==-1) {
			front = 0;
		}
		size++;
	}

	public void doubleSize() {
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}

	public int front() throws WrongIndexException {
		if(size<0) {
			throw new WrongIndexException();
		}
		return data[front];
	}

	public int dequeue() throws WrongIndexException {
		int temp = data[front];
		front = (front+1)%data.length;
//		if(size<=0) {
//			front = -1;
//			end = -1;
//			throw new WrongIndexException();
//		}
		size--;
		return temp;
	}













}
