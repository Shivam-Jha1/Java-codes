package Priority_Queue;
import java.util.*;
import HashMap.Priority_Queue;

public class PriorityQueue_Test {
	
	public static void main(String[] args) {
		
	PQ1<String> pq = new PQ1<>();	
		pq.insert("abc",2);
		pq.insert("bcd", 1);
		pq.insert("def", 4);
		pq.insert("ghi", 23);
		pq.insert("ijk", 12);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}
}
