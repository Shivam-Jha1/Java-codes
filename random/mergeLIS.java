package random;
import java.util.*;
public class mergeLIS {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i=0;i<n1;i++) {
			arr1[i] = s.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i] = s.nextInt();
		}
		int ans = findLis(arr1,arr2,n1,n2);
		System.out.println(ans);
	}

	private static int findLis(int[] arr1, int[] arr2, int n1, int n2) {
		
		int[] ans1 = new int[n1+n2];
		int[] ans2 = new int[n1+n2];
		
		ans1[0]=arr1[0];
		ans2[0]=arr2[0];
		int i=1,j=0,k=1;
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				ans1[k] = arr1[i];
				i++;
				k++;
			}
			else {
				ans1[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			ans1[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			ans1[k] = arr2[j];
			k++;
			j++;
		}
		
		int a=0,b=1,c=1;
		while(a<n1 && b<n2) {
			if(arr1[a]<=arr2[b]) {
				ans2[c] = arr1[a];
				a++;
				c++;
			}
			else {
				ans2[c] = arr2[b];
				c++;
				b++;
			}
		}
		while(a<n1) {
			ans2[c] = arr1[a];
			a++;
			c++;
		}
		while(b<n2) {
			ans2[c] = arr2[b];
			c++;
			b++;
		}
		
		int lsi=0,temp=1,n=n1+n2;
		for(int p=1;p<n;p++) {
			if(ans1[p-1]<=ans1[p]) {
				temp++;
			}
			else {
				if(temp>lsi) {
					lsi=temp;
					temp=1;
				}
				temp=1;
			}
		}
		if(temp>lsi) {
			lsi=temp;
			
		}
		int lsi1=0,temp1=1;
		for(int p=1;p<n;p++) {
			if(ans2[p-1]<=ans2[p]) {
				temp1++;
			}
			else {
				if(temp1>lsi1) {
					lsi1=temp1;
					temp1=1;
				}
				temp1=1;
			}
		}
		if(temp1>lsi1) {
			lsi1=temp1;
		}
		return Math.max(lsi, lsi1);
	}
}
