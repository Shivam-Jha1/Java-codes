package String;
import java.util.Scanner;
public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = S.next();
		System.out.println("The word is : "+str);
		System.out.println(checkPalindrome(str,0,str.length()-1));
	}

	private static boolean checkPalindrome(String str,int i,int j) {
		
		boolean isPalidrome = true;
		
		if(str.length()<=1) {
			return true;
		}

		checkPalindrome(str, i+1, j-1);
		
		if(str.charAt(i)!=str.charAt(j)) {
			return isPalidrome = false;
		}
		if(i<=str.length()/2-1) {
			return isPalidrome = true;
		}
		return isPalidrome;
	}


	//	public static boolean checkPalindrome(String str) {
	//		int j=str.length()-1;
	//		for(int i=0; i<str.length()/2;i++) {
	//			if(str.charAt(i) == str.charAt(j)){
	//				j--;
	//
	//			}
	//			else {
	//				return false;
	//			}
	//		}
	//		return true;
	//	}
}