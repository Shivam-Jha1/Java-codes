package HashMap;
import java.util.*;
public class PairSumTo0 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,-2,4,-2,6,2};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else {
				map.put(arr[1], 1);
			}
		}
		int count;
		for(int i=0;i<arr.length;i++) {
			
		}
		
	}
	
}
