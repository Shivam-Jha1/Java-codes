package HashMap;
import java.util.*;
public class Intro {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 135);
		map.put("China", 140);
		map.put("America", 50);
		
		System.out.println("Map : "+map);
		
		map.put("America", 55);
		
		System.out.println(map.get("America"));
		
		System.out.println(map.containsKey("India"));
		
		Set<String> key = map.keySet();
		System.out.println(key);
		for(String key1:map.keySet()) {
			int val = map.get(key1);
			System.out.println(key1+" "+val);
		}
	}
}
