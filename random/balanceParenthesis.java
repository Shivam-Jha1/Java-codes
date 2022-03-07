package random;
import java.util.*;
public class balanceParenthesis {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		if(isValid(str)) {
			System.out.println("BALANCED");
		}
		else {
			System.out.println("NOT BALANCED");
		}
	}

	private static boolean isValid(String str) {
		boolean ans = true;
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
				st.push(str.charAt(i));
			}
			else if(str.charAt(i) == ')') {
				
				if(!st.isEmpty() && st.peek()=='(') {
					
					st.pop();
				}
					else {
					ans = false;
					break;
				}
			}
			else if(str.charAt(i) == '}') {
				if(!st.isEmpty() && st.peek()=='{') {
					st.pop();
				}
				else {
					ans = false;
					break;
				}
			}
			else if(str.charAt(i) == ']') {
				if(!st.isEmpty() && st.peek()=='[') {
					st.pop();
				}
				else {
					ans = false;
					break;
				}
			}
		}
		if(!st.isEmpty()) {
			ans = false;
		}
		return ans;
	}
}
