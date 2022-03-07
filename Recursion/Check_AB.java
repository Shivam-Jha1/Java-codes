package Recursion;
import java.util.Scanner;

public class Check_AB {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = S.nextLine();
		System.out.print("Original Straing is: "+str);
		checkAB(str,str.length());
	}

	public static boolean checkAB(String input,int n) {
		if(input.length()==1||input.charAt(0)!='a'){
            return false;
        }
		if(input.charAt(1)=='b'&&input.charAt(2)=='b') {
			return true;
		}
		if(input.charAt(1)=='a') {
			return true;
		}
		if(input.charAt(3)=='a') {
			return true;
		}
		checkAB(input,n-1);
		return true;
	}
	
}