package String;
import java.util.Scanner;
public class Reverse_Word_Wise {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String");
		String x = S.nextLine();
		System.out.println("The original string is "+x);
		System.out.println(reverseWordWise(x));
	}

	public static String reverseWordWise(String str) {
		
		String j="";
		String m="";
		int n = str.length();
		int count=0;
		int l = j.length();

		for(int i=str.length()-1;i>=0;i--) {
			j = j+ str.charAt(i);
		}
		
		for(int i=0;i<l;i++) {
			if(j.charAt(i)==' '||j.charAt(i)==l-1) {
				for(int k=i-count-1;k<=count;k++) {
					m = m+ j.charAt(k);
				}
				count = 0;
			}
			else {
				count++;
			}
		}
		return j;
	}
}
