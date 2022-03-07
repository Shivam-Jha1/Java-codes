package HashMap;
import java.util.*;
public class ArrayIntersection {
	public static void main(String[] args) {
		
		int[] arr1 = {2,3,4,5};
		int[] arr2 = {1,3,5,7};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int count = map.get(arr1[i]);
				map.put(arr1[i], count+1);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if(freq>0) {
					System.out.print(arr2[i]+" ");
					map.put(arr2[i], freq-1);
				}
			}
		}
		
	}
}
