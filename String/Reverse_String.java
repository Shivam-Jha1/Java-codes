package String;
import java.util.Scanner;
public class Reverse_String {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = S.nextLine();
		System.out.print("Original Straing is: ");
		System.out.println(str);
		System.out.println("Reversed String is: "+reverseString(str));

	}
	public static String reverseString(String str) {
		String j="";
		for(int i=str.length()-1;i>=0;i--) {
			j = j+ str.charAt(i);
		}
		return j;
	}
}
