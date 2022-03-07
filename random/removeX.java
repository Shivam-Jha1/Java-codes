package random;
import java.util.*;
public class removeX {
	private static final String input = null;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String res = remove(str);
		System.out.println(res);
	}

	private static String remove(String str) {

		return temp(str,0);
	}

	public static String temp(String input,int a)
	{ String r="";
	if(a==input.length())
	{
		return "";
	}

	temp(input,a+1);
	if(input.charAt(a)=='x')
	{
		r=""+temp(input,a+1);
	}
	else
	{
		r+=input.charAt(a)+temp(input,a+1);
	}
	return r;
	}
}

