package Recursion;
import java.util.*;
public class removePI {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = remove(str);
		
		System.out.println(ans);
	}

	private static String remove(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			String ans = remove(str.substring(2));
			return "3.14"+ans;
		}
		else {
			String ans = remove(str.substring(1));
			return str.charAt(0)+ans;
		}
	}
}
