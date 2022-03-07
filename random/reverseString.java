
public class reverseString {

	public static void main(String[] args) {
		
		String rev = "";
		String str = "Hello bro";
		for(int i = str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);	
		System.out.println(rev.substring(6));
		System.out.println(rev.replace('e', 's'));
	}
	
}
