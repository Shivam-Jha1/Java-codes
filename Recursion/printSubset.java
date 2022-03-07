package Recursion;
import java.util.*;
public class printSubset {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		subset(str,"");
		s.close();
	}

	private static void subset(String str,String output) {

		if(str.length()==0) {
			System.out.print(output+" ");
			return;
		}
		subset(str.substring(1,str.length()),output);
		subset(str.substring(1,str.length()),output+str.charAt(0));
	}
}
