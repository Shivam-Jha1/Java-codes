package Recursion;
import java.util.*;

import Linked_List.Array_List;

public class getKeypad {
	
	/*public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		ArrayList<String> words = getKPC(str);
		System.out.println(words);
	}

	static String[] codes = {"","abc","def","ghi","ijk","lmn","opqr","stuv","wxyz"};
	
	private static ArrayList<String> getKPC(String str) {
		
		if(str.length()==0){
			
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> res = getKPC(str.substring(1));
		ArrayList<String> rres = new ArrayList<String>();
		
		String codeForCh = codes[ch - '0'];
		
		for(int i=0;i<codeForCh.length();i++) {
			
			char chCode = codeForCh.charAt(i);
			for(String rstr: res) {
				
				rres.add(chCode+rstr);
			}
		}
		return rres;
	}
}*/
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        String str = s.next();
	        ArrayList<String> arr = getkeypad(str);
	        System.out.println(arr);

	    }

	    static String[] code = { " ", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ",.?" };

	    public static ArrayList<String> getkeypad(String str) {
	    	
	    	if(str.length()==0) {
	    		ArrayList<String> bres = new ArrayList<String>();
	    		bres.add(" ");
	    		return bres;
	    	}

	        char c = str.charAt(0);
	        String res = str.substring(1);
	        ArrayList<String> rres = getkeypad(res);
	        ArrayList<String> myres = new ArrayList<>();

	        String ch = code[c-'0'];
	        for (int i = 0; i < ch.length(); i++) {
	            char chr = ch.charAt(i);
	            for (String rstr : rres) {
	                myres.add(chr + rstr);
	            }
	        }
	        return myres;
	    }
	}
