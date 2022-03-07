package Recursion;


public class Sum_Array{

    public static int sum(int input[]) {
        int n = input.length,add,result = 0;
        if(n == 0){
            return 0;
        }
        int[] smallArray = new int[input.length-1];
        for(int i=1;i<input.length;i++) {
            smallArray[i-1] = input[i];
        }
            add = sum(smallArray);
            result = add+input[n];
            return result;
        }
    }