package random;

import java.util.Scanner;

public class beautiful_String {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		int ans = bs(str);
		System.out.println(ans);
	}

	
	private static int bs(String str) {
		
		
		   if(str.length() == 0){
	            return 0;
	        }
	        String str1 = "";
	        String str2 = "";
	        int ans1 = 0,ans2 = 0;
	        for(int i=0;i<str.length();i++){
	            if(i%2==1){
	                str1 = str1+'0';
	                str2 = str2+'1';
	            }
	            else{
	                str1 = str1+'1';
	                str2 = str2+'0';
	            }
	            if(str.charAt(i)!=str1.charAt(i)){
	                ans1++;
	            }
	            if(str.charAt(i)!=str2.charAt(i)){
	                ans2++;
	            }
	        }
	        return Math.min(ans1,ans2);
	    }
	}