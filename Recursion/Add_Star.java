package Recursion;

public class Add_Star {
public static void main(String[] args) {
	String S = "hello";
	int n = S.length();
	System.out.println(S);
	addStar(S,n);
}

private static String addStar(String S, int n) {
	if(n==1) {
		return S;
	}
	String a = addStar(S,n-1);
	return "";
}
}
