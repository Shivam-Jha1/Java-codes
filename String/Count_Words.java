package String;
import java.util.Scanner;
public class Count_Words {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the String");
	String Str = S.nextLine();
	System.out.println("you have entered --- "+Str);
	countWords(Str);
}

public static int countWords(String str) {
	int word = 1;
    if(str.length() == 0){
        
    }
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
            word++;
        }
    }
    return word;
	
}
}
