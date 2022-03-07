package random;
import java.util.*;

class MAIN{

	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[] = new int[n];
		String as = s.next();
		String bs = s.next();
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int ans = minCost(n,m,as,bs,arr);
		System.out.println(ans);
	}

	private static int minCost(int n, int m, String as, String bs, int[] arr) {
		
		int l = bs.length();
		int count=0;
		for(int i=0;i<=as.length()-l;i++) {
			if(as.substring(i, l+i).equals(bs)) {
				count = count+i+1;
				
			}
		}
		return count;
	}
}