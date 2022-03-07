package String;
import java.util.Scanner;
public class All_Substring {
	public static void main(String[] str) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = S.nextLine();
		System.out.println("The sub string is : ");
		subStrings(s,0,0);
	}
//USING RECURSSION
	private static void subStrings(String s,int i,int j) {
		if(s=="") {
			return;
		}
		
		System.out.println(s.substring(i,j));
		if(j==s.length()) {
			j=i;
			i++;
		}
		if(i==s.length()) {
			return;
		}
		subStrings(s,i,j+1);
	}

	
//	public static void subStrings(String s) {
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<=s.length();j++) {
//				System.out.println(s.substring(i,j));
//			}
//		}
//	}
}
