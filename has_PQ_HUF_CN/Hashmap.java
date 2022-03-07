package has_PQ_HUF_CN;

public class Hashmap {

	//MAXIMUM FREQUENCY NUMBER
	import java.util.*;
	public class Solution {

	    public static int maxFrequencyNumber(int[] arr){ 

	        if(arr.length == 0){
	            return -1;
	        }
	        
	        HashMap<Integer,Integer> map = new HashMap<>();

	        for(int i=0;i<arr.length;i++){

	            if(map.containsKey(arr[i])){
	                int n = map.get(arr[i]);
	                int count = n+1;
	                map.put(arr[i],count);
	            }

	            else{
	                map.put(arr[i],1);
	            }
	        }

	       int value =0;
	        int ans = Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++){
	            if(map.get(arr[i])>value){
	                value=map.get(arr[i]);
	                ans=arr[i];
	            }
	        }
	        return ans;
	        
	    }
	}

//PRINT INTERSECTION
	
	import java.util.*;
	public class Solution {

	    public static void printIntersection(int[] arr1,int[] arr2){

	        HashMap<Integer,Integer> map = new HashMap<>();

	        for(int i=0;i<arr1.length;i++){

	            if(map.containsKey(arr1[i])){
	                int value = map.get(arr1[i]);
	                map.put(arr1[i],value+1);
	            }
	            else{
	                map.put(arr1[i],1);
	            }
	        }

	        for(int i=0;i<arr2.length;i++){

	            if(map.containsKey(arr2[i])){
	                int freq = map.get(arr2[i]);
	                if(freq>0){
	                    System.out.println(arr2[i]);
	                    map.put(arr2[i],freq-1);
	                }
	            }
	        }
	    }
	}
	
	//PRINT SUM TO 0
	import java.util.*;

	public class Solution {
	public static int PairSum(int[] input, int size) {

	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<size;i++){
	            if(map.containsKey(input[i])){
	                int value = map.get(input[i]);
	                map.put(input[i],value+1);
	            }
	            else{
	                map.put(input[i],1);
	            }
	        }
	        int count = 0;
	        for(int i=0;i<size;i++){
	           if(input[i]==0) {
					map.put(0,map.get(0)-1);
					if(map.containsKey(0))
						count=count+map.get(0);
				}
				else {
					if(map.containsKey(-input[i])) 
					 {
						int x=-input[i];
						 int freq=map.get(x);
						 count=count+freq;
						 map.remove(input[i]);
					 }
				}
	        }
	        return count;
	    }
	}
	//EXACT UNIQUE CHARACTERS
	
	import java.util.HashMap;

	public class Solution {

	    public static String uniqueChar(String str){
	        
	        HashMap<Character,Integer> map = new HashMap<>();
	        String newstr="";
	        for (int i=0;i<str.length();i++)
	        {
	            char c = str.charAt(i);
	            if (map.containsKey(c))
	            {
	                map.put(c, map.get(c)+1);
	            }
	            else
	            {
	                newstr=newstr+c;
	                map.put(c,1);
	            }
	        }
	        return newstr;
		}
	}
	
	//LONGEST CONSECUTIVE SQQUENCE
	
	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;

	public class Solution {
	    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

	        HashMap<Integer, Boolean> map = new HashMap<>();

	        for(int val:arr) {
	            map.put(val, true);
	        }
	        for(int val:arr) {
	            if(map.containsKey(val-1)) {
	                map.put(val, false);
	            }
	        }
	        int msp = 0;
	        int ml = 0;
	        for(int val:arr) {
	            if(map.get(val) == true) {
	                int tl = 1;
	                int tsp = val;

	                while(map.containsKey(tsp+tl)) {
	                    tl++;
	                }

	                if(tl>ml) {
	                    msp = tsp;
	                    ml = tl;
	                }
	            }
	        }
	        System.out.println(msp+" "+(ml+msp-1));

	        ArrayList<Integer> ans = new ArrayList<>();
	        return ans;
	    }
	}
	
	//PAIR WITH DIFFERNECE K
	
	import java.util.*;
	public class Solution {

	    public static int getPairsWithDifferenceK(int arr[], int k) {


	            HashMap<Integer,Integer> map = new HashMap<>();
	        
	            for(int key:arr)
	            {	
	                if(map.containsKey(key))
	                {
	                    map.put(key,map.get(key)+1);
	                }
	                else
	                {
	                    map.put(key,1);
	                }   
	            }

	            int countPairs=0;
	            if (k==0)
	            {
	                for (Integer i: map.keySet())
	                {
	                    int val=map.get(i);
	                    countPairs=countPairs+(val*(val-1))/2;
	                }
	                return countPairs;
	            }

	            for (Integer i: map.keySet())
	            {

	                if (map.containsKey(k+i))
	                {
	 
	                    countPairs=countPairs+(map.get(i)*map.get(k+i));   
	  
	                }
	                if (map.containsKey(i-k))
	                {

	                    countPairs=countPairs+(map.get(i)*map.get(i-k));   

	                }
	            }
	            countPairs=countPairs/2;
	            return countPairs;
	        }
	    }

//LONGEST SUBSET ZERO SUM
	
	import java.util.HashMap;
	public class Solution {

		public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
			// Write your code here
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int sum=0,maxLen=-1;
	        for (int i=0;i<arr.length;i++)
	        {
	            sum=sum+arr[i];
	            //System.out.println("Current cumulative sum: "+sum);
	            if (sum==0)
	            {
	                maxLen=i+1;
	            }
	            if (map.containsKey(sum))
	            {
	                int prevIndex=map.get(sum);
	                //System.out.println("Sum found previously at index: "+prevIndex);
	                int currLen=i-prevIndex;
	                //System.out.println("Length of 0 sum: "+currLen);
	                if (currLen>maxLen)
	                {
	                    maxLen=currLen;
	                    //System.out.println("Max Length of 0 sum: "+maxLen);
	                }
	            }
	            else
	            {
	                //System.out.println("Adding sum to HashMap");
	                map.put(sum,i);
	            }
	            //System.out.println();
	        }
	        return maxLen;
		}
	}
}
