package String;
import java.util.Scanner;
public class Check_Permutation {
	public static void main(String[] args) {
Scanner S = new Scanner(System.in);
System.out.println("Enter the string1");
String str1 = S.nextLine();
System.out.println("Enter the string2");
String str2 = S.nextLine();
System.out.println("String1 is : "+str1+" "+"String2 is : "+str2);
//checkPermutation(str1,str2);
}
}

	/*public static boolean checkPermutation(String str1, String str2) {
		int a = str1.length();
		int b = str2.length();
		if(a!=b) {
			return false;
		}
		else if(a==b){
			for(int i=0;i<a;i++) {
				
			}
		}
	}
}*/