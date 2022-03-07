package HashMap;
import java.util.*;
public class Priority_Queue {

	public static void main(String[] args) {
		
		int[] rank = {34,2,55,65,12,1,23};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int val:rank) {
			pq.add(val);
		}
		while(pq.size()>0) {
			System.out.print(pq.peek()+" ");
			pq.remove();
		}
	}
}
