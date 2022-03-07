package practise;
import java.util.Scanner;
public class String2 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	String str = S.nextLine();
	System.out.print(str+" ");
	char[] try = str.toCharArray();
	for(int i=try.length()-1;i>=0;i++) {
		System.out.println(try[i]);
	}
}
}

