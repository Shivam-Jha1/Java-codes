package random;
import java.util.*;
public class shuffleString {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = S.nextLine();
		int n = S.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = S.nextInt();
		}
		String ans = restoreString(Str,arr);
		System.out.println(ans);
	}
	
	private static String restoreString(String s, int[] indices) {
		
		  char[] c = new char[indices.length];
	        for(int i=0;i<s.length();i++){
	            c[indices[i]] = s.charAt(i);
	        }
	        return new String(c);
	    }
	}