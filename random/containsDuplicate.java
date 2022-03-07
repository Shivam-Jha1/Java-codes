package random;
import java.util.*;
public class containsDuplicate {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		boolean ans = false;
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            int temp = pq.poll();
            if(temp==pq.peek()){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int ans=0;
		for(int i=0;i<n;i++) {
			ans ^=arr[i];
		}
		for(int i=0;i<=n-2;i++) {
			ans^=i;
		}
		System.out.println(ans);
	}
}*/
