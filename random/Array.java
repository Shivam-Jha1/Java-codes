import java.util.*;

public class Array {
	public static void main(String []args) {

		System.out.println("Enter the size of array");
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter the elements of array");

		for(int i=0;i<n;i++) {
			//	System.out.println("Enter element at certain index");
			arr[i] = S.nextInt();

		}
		for(int i=0;i<n;i++) {
			//	System.out.println("Enter element at certain index");
			arr1[i] = S.nextInt();

		}
	//	int N = S.nextInt();
		//pair(arr,N,n);
		int ans = countStudents(arr,arr1);
		System.out.println("Ans is "+ans);
	}

	/*private static int pair(int[] arr, int n, int n2) {

		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr[j]==n) {
					ans = 1;
				}
			}
		}
		return ans;
	}*/
	 public static int countStudents(int[] students, int[] sandwiches) {
	        
	        int n1 = students.length;
	        int n2 = sandwiches.length;
	        Stack<Integer> sw = new Stack<>();
	        for(int i=n2-1;i>=0;i--){
	            sw.push(sandwiches[i]);
	        }
	        Stack<Integer> s1 = new Stack<>();
	        Stack<Integer> s2 = new Stack<>();
	        
	        for(int i=n1-1;i>=0;i--){
	            s1.push(students[i]);
	        }
	        while(!sw.isEmpty()){
	            if(s1.peek()!=sw.peek() && isSame(s1)){
	                return s1.size();
	            }
	            if(sw.peek()==s1.peek()){
	                sw.pop();
	                s1.pop();
	            }
	            else{
	                s2.push(s1.pop());
	            }
	            if(s1.isEmpty()){
	                while(!s2.isEmpty()){
	                    s1.push(s2.pop());
	                }
	            }
	        }
	        return 0;
	    }
	    public static boolean isSame(Stack<Integer> s1){
	        
	    	if(s1.size()<2) {
	    		return true;
	    	}
	    	
	        while(!s1.isEmpty()){
	            int e1 = s1.pop();
	            int e2 = s1.peek();
	            if(e1!=e2){
	                return false;
	            }
	        }
	        return true;
	    }
	}
