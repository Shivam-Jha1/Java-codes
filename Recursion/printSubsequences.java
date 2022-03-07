package Recursion;
import java.util.Scanner;

public class printSubsequences {
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	String str = s.next();
	
	printSub(str,"");
	}

	private static void printSub(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		printSub(roq, ans+"");
		printSub(roq, ans+ch);
		
	}
}
