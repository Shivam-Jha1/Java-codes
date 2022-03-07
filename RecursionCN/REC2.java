package RecursionCN;

public class REC2 {

	//REMOVE X
	Public class solution {

		
		public static String removeX(String input){
			
	        return removeX(input,0,"");
		}
	    
	    public static String removeX(String input,int n,String str){
	        
	        if(n==input.length()){
	            return "";
	        }
	        if(input.charAt(n)!='x'){
	            str = str+input.charAt(n);
	        }
	        String ans = removeX(input,n+1,"");
	        return str+ans;
	    }
	}

	//REMOVE DUPLICATE RECURSIVELY
	public class Solution {

	    public static String removeConsecutiveDuplicates(String s) {

	        if(s.length()<=1){
	            return s;
	        }
	        if(s.charAt(0)==s.charAt(1)){
	            String str = removeConsecutiveDuplicates(s.substring(1));
	            return str;
	        }
	        else{
	            String str = removeConsecutiveDuplicates(s.substring(1));
	            return s.charAt(0)+str;
	        }
	    }
	}
	
	//MERGE SORT
	public class solution {

	    public static void mergeSort(int[] input){
	        int n = input.length;
	        if(n<=1){
	            return;
	        }
	        int[] a = new int[n/2];
	        int[] b = new int[n-(n/2)];
	        for(int i=0;i<n/2;i++){
	            a[i]=input[i];
	        }
	        for(int i=n/2;i<n;i++){
	            b[i-n/2]=input[i];
	        }
	        mergeSort(a);
	        mergeSort(b);
	        mergeSort(a,b,input);

	    }
	    public static void mergeSort(int[] s1,int[] s2,int[] s){
	        int i=0,j=0,k=0;
	        while(i<s1.length && j<s2.length){
	            if(s1[i]<s2[j]){
	                s[k]=s1[i];
	                k++;
	                i++;
	            }
	            else{
	                s[k]=s2[j];
	                k++;
	                j++;
	            }
	        }
	        if(i<s1.length){
	            while(i<s1.length){
	                s[k] = s1[i];
	                i++;
	                k++;
	            }
	        }
	        if(j<s2.length){
	            while(j<s2.length){
	                s[k] = s2[j];
	                j++;
	                k++;
	            }
	        }
	    }
	}

	//QUICKSORT
	
	public class Solution {
	    public static  int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        {  
	            if (arr[j] < pivot) 
	            { 
	                i++;  
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 

	        return i+1; 
	    } 
	    public static  void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            int pi = partition(arr, low, high); 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	    public static void quickSort(int[] input) {
	        int si=0;
	        int ei=input.length-1;
	        sort(input,si,ei);
	    }
	}
//TOWER OF HANOI
	
	public class solution {

		public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
	        if(disks==0){
	            return;
	        }
			if(disks==1){
	            System.out.println(source+" "+destination);
	            return;
	        }
	        towerOfHanoi(disks-1,source,destination,auxiliary);
	        System.out.println(source+" "+destination);
	        towerOfHanoi(disks-1,auxiliary,source,destination);
		}
	}

	
	
}
