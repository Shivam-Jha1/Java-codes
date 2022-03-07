package HashMap;
import java.util.*;
public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {

		int[] arr = {10,5,9,1,11,8,6,15,3,12,2};

		HashMap<Integer,Boolean> map = new HashMap<>();

		for(int var:arr) {
			map.put(var, true);
		}

		for(int var:arr) {
			if(map.containsKey(var-1)) {
				map.put(var, false);
			}
		}

		int msp = 0;
		int ml = 0;

		for(int var:arr) {
			if(map.get(var)==true) {
				int ts = var;
				int tl = 1;
				while(map.containsKey(ts+tl)) {
					tl++;
				}
				if(tl>ml) {
					msp = ts;
					ml = tl;
				}
			}
		}
		System.out.println(msp+" "+(msp+ml-1));
	}
}
