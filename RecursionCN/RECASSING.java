package RecursionCN;

public class RECASSING {

	//GEOMETRIC SUM
	import java.lang.Math;
	public class solution {

	    public static double findGeometricSum(int k){
	        if(k==0){
	            return 1.00000;
	        }
	        double a = findGeometricSum(k-1);
	        double add = a + 1/(Math.pow(2,k));
	        return add;
	        
	    }
	}

	//CHECK PALINDROME

public class solution {

	public static boolean isStringPalindrome(String input) {
		
        return isStringPalindrome(input,0,input.length()-1);
	}
    
    public static boolean isStringPalindrome(String input,int si,int ei){
        
        if(si>=ei){
            return true;
        }
        if(input.charAt(si)!=input.charAt(ei)){
            return false;
        }
        return isStringPalindrome(input,si+1,ei-1);
    }
}

//SUM OF DIGITS

public class solution {

    public static int sumOfDigits(int input){

        if(input==0){
            return 0;
        }
        int ans = sumOfDigits(input/10);

        return ans+input%10;
    }
}
//MULTIPLICATION

public class solution {

    public static int multiplyTwoIntegers(int m, int n){
        if(n==0){
            return 0;
        }
        return m+ multiplyTwoIntegers(m,n-1);
    }
}
//COUNT ZEROES
public class solution {

    public static int countZerosRec(int input){
     if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);
    }
}
//STRING TO INTEGER
public class solution {

	public static int convertStringToInt(String input){
		if(input.length()==0)
            return 0;
        
        int m=(int)input.charAt(0)-48;
        int n=input.length();
        
        while(n!=1)
        {
            m*=10;
            n--;
        }
        
        return m+convertStringToInt(input.substring(1,input.length()));
	}
}
//PAIR STAIR
public class solution {

    // Return the updated string
    public static String addStars(String s) {
         if (s.equals("") || s.length() == 1) return s;
  if (s.charAt(0) == s.charAt(1))
    return s.charAt(0) + "*" + addStars(s.substring(1));
  else
    return s.charAt(0) + addStars(s.substring(1));
    }
   
}
//CHECK AB
public class Solution {

    public static boolean checkAB(String input) {
        int len = input.length();

        if(len==0){
            return true;
        }

        boolean smallAns = false;

        //take all cases one by one
        if(len==1){
            if(input.charAt(0)=='a'){
                smallAns = true;
                input = input.substring(1,len);
            }
        }
        
        else if(len==2){
            if(input.charAt(0) =='a' && input.charAt(1)=='a'){
                smallAns = true;
                input = input.substring(2,len);
            }
        }
        
        else if (len>=3){
            if(input.charAt(0)=='a' && input.substring(1,3).equals("bb")){
                smallAns = true;
                input = input.substring(3,len);
            }
            
            else if(input.charAt(0)=='a' && input.charAt(1)=='a'){
                smallAns = true;
                input = input.substring(1,len);
            }
        }
        
        return smallAns && checkAB(input);
    }
}
//STAICASE
public class Solution {


    public static int staircase(int n){
        if(n==0){
            return 1;
        }else if (n==1){
            return 1;
        }else if(n==2){
            return 2;
        }

        int x = staircase(n-1);
        int y = staircase(n-2);
        int z = staircase (n-3);
        int sum = x+y+z;
        return sum;
    }

}
	
}
