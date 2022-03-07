package Linked_List;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		int arr[] = {4,4,6,6,6,8,9,4};
		ArrayList<Integer> result = removeConsucutiveDuplicates(arr);
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}
	}
	private static ArrayList<Integer> removeConsucutiveDuplicates(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}
}
