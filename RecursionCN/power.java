package RecursionCN;

public static int power(int x, int n) {
    
    if(n==0){
        return 1;
    }
    int ans = x*power(x,n-1);
    return ans;
}

//NO OF DIGIT
public class Solution {

	public static int count(int n){
        
        if(n==0){
            return 0;
        }
        int ans = count(n/10);
        return ans+1;
}
}

//PRINT FIRST N NATURAL NUMBERS
public class Solution {

    public static void print(int n){

        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}

//SUM OF ARRAY

public class Solution {

	public static int sum(int input[]) {
        
        int n = input.length;
        return sum(input,n-1);
	}
    public static int sum(int input[],int n){
        
        if(n<0){
            return 0;
        }
        int ans = sum(input,n-1);
        return ans+input[n];
    }
}

//CHECK NUMBER IN AN ARRAY
public class Solution {

    public static boolean checkNumber(int input[], int x,int n) {
        if(n==0){
            return false;
        }
        if(input[n]==x){
            return true;
        }
        return checkNumber(input,x,n-1);
    }
    public static boolean checkNumber(int input[], int x){
        return checkNumber(input,x,input.length-1);
    }
}


//FIRST INDEX OF ARRAY

public class Solution {

	public static int firstIndex(int input[], int x) {
        return firstIndex(input,x,0);
	}
    public static int firstIndex(int input[], int x,int si){
        if(si==input.length){
            return -1;
        }
        if(input[si]==x){
            return si;
        }
        return firstIndex(input,x,si+1);
    }
}
//LAST INDEX OF ARRAY

public class Solution {

	public static int lastIndex(int input[], int x) {
        return lastIndex(input,x,input.length-1);
	}
    public static int lastIndex(int input[],int x,int si){
        if(si==-1){
            return -1;
        }
        if(input[si]==x){
            return si;
        }
        return lastIndex(input,x,si-1);
    }
}

//

