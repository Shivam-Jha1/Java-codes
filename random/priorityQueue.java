package random;
import java.util.*;

import Priority_Queue.Element;
public class priorityQueue<T> {

	ArrayList<Element<T>> heap;

	public priorityQueue(){
		heap = new ArrayList<>();
	}

	public void insert(T value,int priority) {
		
		Element<T> e = new Element<>(value, priority);
		heap.add(e);
		
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		
		while(childIndex>0) {
			
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				
				int temp = heap.get(childIndex);
				
				
			}
			else {
				return;
			}
		}
		
	}
}
