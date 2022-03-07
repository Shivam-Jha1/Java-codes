package Recursion;
import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		print(arr);
		System.out.println();
		System.out.println("Enter the element to search");
		int x = s.nextInt();
		System.out.println(binarySearch(arr,0,arr.length-1,x));
		
	}
	public static int binarySearch(int[] arr,int si,int ei,int x) {
		if(si>ei) {
			return -1;
		}
		int mid = (si+ei)/2;
		if(arr[mid]==x) {
			return mid;
		}
		else if(arr[mid]<x){
			return binarySearch(arr,mid+1,ei,x);
		}
		else {
			return binarySearch(arr,si,mid-1,x);
		}	
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
