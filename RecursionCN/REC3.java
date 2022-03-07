package RecursionCN;

public class REC3 {

	//getKeypad
	
	public class solution {

		public static String[] keypad(int n){
	        if(n == 0){
	            return new String[]{""};
	        }
	        String[] prev =keypad(n/10);
	        String[] actual =new String[(int)Math.pow(4.00,count(n))];

	        String helper=setOfCharacter(n%10);
	        int k=0;
	        for(int j=0;j<helper.length();j++){
	            for (String s : prev) {
	                actual[k] = s + helper.charAt(j);
	                k++;
	            }
	        }
	        int count=0;
	        for (String s : actual) {
	            if (s == null) {
	                count++;
	            }
	        }
	        String[] newString =new String[actual.length-count];
	        for(int i=0;i<actual.length;i++){
	            if(actual[i]!=null){
	                newString[i]=actual[i];
	            }
	        }
	        return newString;
	    }
	    public static double count(int n){
	        double count=0;
	        while(n>0){
	            count++;
	            n=n/10;
	        }
	        return count;
	    }
	    public static String setOfCharacter(int n){
	        switch(n){
	            case 2:	return "abc";

	            case 3:	return "def";

	            case 4:	return "ghi";

	            case 5:	return "jkl";

	            case 6:	return "mno";

	            case 7:	return "pqrs";

	            case 8:	return "tuv";

	            case 9:	return "wxyz";

	            default:break;
	        }
	        return "";
	    }
	}
	
	//PRINT KEYPAD
	public class solution {
	    
	      public static String[] codes(int n){

	        if(n==0||n==1){
	            System.exit(0);
	        }
	        if(n==2){
	            String[] output = {"a","b","c"};
	            return output;
	        }
	        if(n==3){
	            String[] output = {"d","e","f"};
	            return output;
	        }
	        if(n==4){
	            String[] output = {"g","h","i"};
	            return output;
	        }
	        if(n==5){
	            String[] output = {"j","k","l"};
	            return output;
	        }
	        if(n==6){
	            String[] output = {"m","n","o"};
	            return output;
	        }
	        if(n==7){
	            String[] output = {"p","q","r","s"};
	            return output;
	        }
	        if(n==8){
	            String[] output = {"t","u","v"};
	            return output;
	        }
	        else{
	            String[] output = {"w","x","y","z"};
	            return output;
	        }
	    }
	    
		public static void printKeypad(int n,String output){
			
	        if(n==0 || n==1){
	           System.out.println(output); 
	            return;
	        }
	        String[] smallINt = codes(n%10);
	        for(int i=0;i<smallINt.length;i++){
	            printKeypad(n/10,smallINt[i]+output);
	        }
			
		}
	    public static void printKeypad(int input){
	        printKeypad(input,"");
	    }
	}

	//RETURN SUBSET SUM TO K
	public class solution {


		public static int[][] subsetsSumK(int input[], int k) {

	        return subsetsSumKHelper(input,k,0);
		}
	    
	    private static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
	    {

	        if (startIndex==input.length)
	        {
	            int arr[][];
	            if (k==0)
	            {
	                 arr = new int[1][0];
	            }
	            else
	            {
	                arr = new int[0][0];
	            }
	            return arr;
	        }

	        int temp1[][] = subsetsSumKHelper(input,k-input[startIndex],startIndex+1);
	        int temp2[][] = subsetsSumKHelper(input,k,startIndex+1);
	        

	        int output[][] = new int[temp1.length+temp2.length][];
	        for (int i=0;i<temp2.length;i++)
	        {
	            output[i] = new int[temp2[i].length];
	            for (int j=0;j<temp2[i].length;j++)
	            {
	                output[i][j]=temp2[i][j];
	            }
	        } 
	        
	        for (int i=0;i<temp1.length;i++)
	        {
	            output[i+temp2.length] = new int[temp1[i].length+1];
	            output[i+temp2.length][0] = input[startIndex];
	            for (int j=1;j<output[i+temp2.length].length;j++)
	            {
	                output[i+temp2.length][j]=temp1[i][j-1];
	            }
	        }
	        
	        return output;
	    }
	}
	
	//RETURN SUBSET OF AN ARRAY
	public class solution {


		public static int[][] subsets(int input[]) {

			return subsetsHelper(input,0);
		}
	    
	    private static int[][] subsetsHelper(int[] input, int startIndex)
	    {
	        if (startIndex==input.length)
	        {
	            return new int[1][0];
	        }
	        int[][] temp = subsetsHelper(input, startIndex+1);

	        int[][] smallOutput = new int[temp.length*2][];
	        
	        for (int i=0;i<temp.length;i++)
	        {
	            smallOutput[i] = new int[temp[i].length];
	            int[] smallTemp = temp[i];
	            for (int j=0;j<temp[i].length;j++)
	            {
	                smallOutput[i][j]=smallTemp[j];
	            }
	        }
	        
	        for (int i=0;i<temp.length;i++)
	        {
	            smallOutput[i+temp.length] = new int[temp[i].length+1];
	            smallOutput[i+temp.length][0]=input[startIndex];
	            int[] smallTemp = temp[i];
	            for (int j=1;j<=temp[i].length;j++)
	            {
	                smallOutput[i+temp.length][j]=smallTemp[j-1];
	            }
	        }

	        return smallOutput;
	    }
	}
	
	//RETURN PERMUTATION OF STRING
	
	public class solution {
		
		public static String[] permutationOfString(String input){

	        if (input.length()==0)
	            return new String[1];
	        
	        if (input.length()==1)
	        {
	            String[] arr = new String[1];
	            arr[0]=input;
	            return arr;
	        }
	        
	        char c=input.charAt(0);
	        String[] temp = permutationOfString(input.substring(1));
	        String[] output = new String[temp.length*input.length()];

	        int k=0;
	        for (int i=0;i<temp.length;i++)
	        {
	            String newstr=temp[i];
	            for (int j=0;j<newstr.length();j++)
	            {
	                output[k]=newstr.substring(0,j)+c+newstr.substring(j);
	                k=k+1;
	            }
	            output[k]=newstr+c;
	            k=k+1;

	        }
	        
	        return output;
			
		}
		
	}
	
	//PRINT SUBSETS OF ARRAY
	
	public class solution {
		public static void printSubsets(int input[]) {

	       printSubsetsHelper(input,0,new int[0]);
		}
	    
	    private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
	    {

	        if (startIndex==input.length)
	        {
	            for (int i=0;i<output.length;i++)
	            {
	                System.out.print(output[i]+" ");
	            }
	            System.out.println();
	            return;
	        }
	        

	        int[] newOutput = new int[output.length+1];
	        for (int i=0;i<output.length;i++)
	        {
	            newOutput[i]=output[i];
	        }
	        newOutput[output.length]=input[startIndex];
	        printSubsetsHelper(input,startIndex+1,newOutput);
	        

	        printSubsetsHelper(input,startIndex+1,output);
	    }
	}
	
	//PRINT SUBSET SUM TO K
	
	public class solution {
		
	    public static void printSubsetsSumTok(int input[], int k) {

			int[][] output = subsetsSumKHelper(input,k,0);
	        for (int i=0;i<output.length;i++)
	        {
	            int[] arr = output[i];
	            for (int j=0;j<arr.length;j++)
	            {
	                System.out.print(arr[j]+" ");
	            }
	            System.out.println();
	        }
		}
	    
	    
	    private static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
	    {

	        if (startIndex==input.length)
	        {
	            int arr[][];
	            if (k==0)
	            {
	                 arr = new int[1][0];
	            }
	            else
	            {
	                arr = new int[0][0];
	            }
	            return arr;
	        }

	        int temp1[][] = subsetsSumKHelper(input,k-input[startIndex],startIndex+1);
	        int temp2[][] = subsetsSumKHelper(input,k,startIndex+1);
	        
	        int output[][] = new int[temp1.length+temp2.length][];
	        for (int i=0;i<temp2.length;i++)
	        {
	            output[i] = new int[temp2[i].length];
	            for (int j=0;j<temp2[i].length;j++)
	            {
	                output[i][j]=temp2[i][j];
	            }
	        } 
	        
	        for (int i=0;i<temp1.length;i++)
	        {
	            output[i+temp2.length] = new int[temp1[i].length+1];
	            output[i+temp2.length][0] = input[startIndex];
	            for (int j=1;j<output[i+temp2.length].length;j++)
	            {
	                output[i+temp2.length][j]=temp1[i][j-1];
	            }
	        }
	        
	        return output;
	    }
	}
	
	//PRINT PERMUTATION OF STRING
	
	public class solution {

	    public static void permutations(String input){

	        permutationsHelper(input,"");
	    }

	    private static void permutationsHelper(String input, String output){
	        
	        if (input.length()==0)
	            System.out.println(output);

	        for (int i=0;i<input.length();i++)
	            permutationsHelper(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));
	        
	    }
	}
}
