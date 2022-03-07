import java.util.Scanner;

public class Ascii_value {
	
	    
	    public static void main(String[] args) {
	        char c;
	     
	    
	        Scanner S = new Scanner(System.in);
	        c = S.next().charAt(0);
	        
	        if(c>=65&&c<=90){
	            System.out.println("1");
	        }
	        else if(c>=97&&c<=122){
	            System.out.println("0");
	        }
	        else{
	            System.out.println("-1");
	        }

	    }
	}

