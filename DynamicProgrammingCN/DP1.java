package DynamicProgrammingCN;

public class DP1 {

	//STAIR CASE
	
	public class Solution {

	    public static long staircase(int n) {

	        long count[] = new long[n+1];

	        for(int i=0;i<=n;i++){
	            count[i] = -1;
	        }
	        return staircase(n,count);

	    }
	    public static long staircase(int n,long[] count) {

	        if(n ==0 || n ==1 || n==2){
	            return n;
	        }
	        if(n==3){
	            return 4;
	        }
	        long ans1,ans2,ans3;

	        if(count[n-1]==-1){
	            ans1 = staircase(n-1,count);
	            count[n-1] = ans1;
	        }
	        else{
	            ans1 = count[n-1];
	        }

	        if(count[n-2]==-1){
	            ans2 = staircase(n-2,count);
	            count[n-2] = ans2;
	        }
	        else{
	            ans2 = count[n-2];
	        }

	        if(count[n-3]==-1){
	            ans3 = staircase(n-3,count);
	            count[n-3] = ans3;
	        }
	        else{
	            ans3 = count[n-3];
	        }

	        long ans = ans1+ans2+ans3;
	        return ans;
	    }
	}
	
	//MIN STEPS TO ONE
	
	import java.util.*;
	public class Solution {

	    public static int countMinStepsToOne(int n) {

	        if(n==1){
	            return 0;
	        }

	        int ans1 = countMinStepsToOne(n-1);

	        int ans2 = Integer.MAX_VALUE;
	        if(n%2 == 0)
	            ans2 = countMinStepsToOne(n/2);

	        int ans3 = Integer.MAX_VALUE;
	        if(n%3==0)
	            ans3  = countMinStepsToOne(n/3);

	        int ans = Math.min(ans1,Math.min(ans2,ans3)) + 1;

	        return ans;
	    }
	}
	
	//MIN STEPS TO 1 USING DP
	
	public class Solution {

		public static int countMinStepsToOne(int n) {
			
	        int storage[]= new int[n+1];
	        storage[1]=0;
	        
	        for(int i=2; i<=n; i++){
	            int min= storage[i-1];
	            
	       		if(i%3==0){
	            	if(min> storage[i/3]){
	                	min= storage[i/3];
	            	}
	        	}
	            
	            if(i%2==0){
	            	if(min> storage[i/2]){
	                	min= storage[i/2];
	            	}
	        	}
	           storage[i]= 1+min;
	       }
	        return storage[n];
		}

	}
	
	//MINIMUM NUMBER OF SQUARE
	
	import java.util.*;
	public class Solution {

	    public static int minCount(int n) {

	        int[] dp = new int[n+1];

	        for(int i=0;i<dp.length;i++){
	            dp[i] = -1;
	        }
	        return minCount(n,dp);
	    }

	    public static int minCount(int n,int[] dp){

	        if(n==0){
	            return 0;
	        }

	        int minAns = Integer.MAX_VALUE;
	        for(int i=1;(i*i<=n);i++){

	            int currAns;
	            if(dp[n-(i*i)] == -1){
	                currAns = minCount(n-(i*i),dp);
	                dp[n-(i*i)] = currAns;
	            }
	            else{
	                currAns = dp[n-(i*i)];
	            }

	            if(minAns>currAns){
	                minAns = currAns;
	            }
	        }
	        return minAns+1;
	    }
	}
	
	//BYTE LANDIAN
	
	import java.util.HashMap;
	public class Solution {
	    
		public static long bytelandian(long n, HashMap<Long, Long> memo) {
	        // Write your code here
	        //Handle base case for n=0,1
	        if (n<12)
	        {
	            memo.put(n,n);
	            return n;
	        }
	        
	        if (!memo.containsKey(n))
	        {
	            long ans1=bytelandian(n/2,memo);
	        	long ans2=bytelandian(n/3,memo);
	        	long ans3=bytelandian(n/4,memo);
	        
	        	long currVal=ans1+ans2+ans3;
	        	if (currVal>n)
	            	memo.put(n,currVal);
	        	else
	            	memo.put(n,n);
	            
	        }
	        
	        return memo.get(n);
	            
	        /*
	        //Recursive solution
	        
	        memo.put((long)0,(long)0);
	        memo.put((long)1,(long)1);
	        
	        for (int i=2;i<=n;i++)
	        {
	            long ans1=memo.get(i/2);
	            long ans2=memo.get(i/3);
	            long ans3=memo.get(i/4);
	            
	            long currentVal=ans1+ans2+ans3;
	            if (currentVal>i)
	            {
	                memo.put((long)i,currentVal);
	            }
	            else
	            {
	                memo.put((long)i,(long)i);
	            }
	        }
	        
	        return memo.get(n);
	        */    
		}

	}
	
	//LOOT HOUSES
	
	public class Solution {

		public static int maxMoneyLooted(int[] houses) {
			//Your code goes here
	        //Handling the base cases where number of houses = 0,1,2
	        if (houses.length==0)
	            return 0;
	        
	        if (houses.length==1)
	            return houses[0];
	        
	        if (houses.length==2)
	            return Math.max(houses[0],houses[1]);
	        
	        int n = houses.length;
	        int[] dp = new int[n];
	        dp[0]=houses[0];
	        dp[1]=Math.max(houses[0],houses[1]);
	        
	        for (int i=2;i<n;i++)
	        {
	            //For every house, we consider two cases
	            //Case 1 - Current house is counted as part of the max value => This means the previous house cannot be counted
	            int maxVal1=dp[i-2]+houses[i];
	            
	            //Case 2 - Current house is not counted as part of the max value => This means previous house can be counted
	            int maxVal2=dp[i-1];
	            
	            //Max value till current house is maximum of the two possible max values till now
	            dp[i]=Math.max(maxVal1,maxVal2);
	        }
	        
	        //Final element of dp stores max possible value for given number of houses and their respective amounts of loot
	        return dp[n-1];
	        
		}

	}
	
	//COIN TOWER
	
	public class Solution {

		public static String findWinner(int n, int x, int y) {
			//Your code goes here
	        int[] dp = new int[n+1];
	        // 0 - Whis wins ; 1 - Beerus wins
	        dp[0]=0;
	        dp[1]=1;
	    
	        for (int i=2;i<=n;i++){
	            //Beerus wins if dp[i-1] or dp[i-x] or dp[i-y] is 0, i.e, Whis wins when the number of coins is (i-1), (i-x) or (i-y)
	            //If none of them are 0, then Beerus cannot win => This means Whis wins for i number of coins
	            if (dp[i-1]==0)
	            {
	                dp[i]=1;
	            }
	            else if ((i-x)>=0 && dp[i-x]==0)
	            {
	                dp[i]=1;
	            }
	            else if ((i-y)>=0 && dp[i-y]==0)
	            {
	                dp[i]=1;
	            }
	            else
	            {
	                dp[i]=0;
	            }
	            /*
	            if (dp[i]==1)
	            	System.out.println("For n="+i+" coins, Winner is: Beerus");
	        	else
	            	System.out.println("For n="+i+" coins, Winner is: Whis");
	            */
	        }
	        
	        if (dp[n]==1)
	            return "Beerus";
	        else
	            return "Whis";
		}

	}
	
}
