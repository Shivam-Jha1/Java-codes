package HashMap;
import java.util.*;
public class HighestFreqNo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word"
				+ "");
		String str = s.nextLine();

		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++) {

			Character ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch,value+1);
			}
			else {
				map.put(ch, 1);
			}
		}

		char mfc = str.charAt(0);
		for(Character key:map.keySet()) {
			if(map.get(key)>map.get(mfc)) {
				mfc = key;
			}
		}
		System.out.println(mfc);	
	}	
}

