package has_PQ_HUF_CN;

public class priorityQueue {
	
	//REMOVE MIN
	
	import java.util.ArrayList;
	import java.util.*;
	public class PQ {

	    private ArrayList<Integer> heap;

	    public PQ() {
	        heap = new ArrayList<Integer>();
	    }

	    boolean isEmpty() {
	        return heap.size() == 0;
	    }

	    int size() {
	        return heap.size();
	    }

	    int getMin() throws PriorityQueueException {
	        if (isEmpty()) {
	            // Throw an exception
	            throw new PriorityQueueException();
	        }
	        return heap.get(0);
	    }

	    void insert(int element) {
	        heap.add(element);
	        int childIndex = heap.size() - 1;
	        int parentIndex = (childIndex - 1) / 2;

	        while (childIndex > 0) {
	            if (heap.get(childIndex) < heap.get(parentIndex)) {
	                int temp = heap.get(childIndex);
	                heap.set(childIndex, heap.get(parentIndex));
	                heap.set(parentIndex, temp);
	                childIndex = parentIndex;
	                parentIndex = (childIndex - 1) / 2;
	            } else {
	                return;
	            }
	        }
	    }

	    int removeMin() throws PriorityQueueException {

	        if(isEmpty()) {
	            throw new PriorityQueueException();
	        }
	        int temp = heap.get(0);
	        //T ans = removed.value;

	        heap.set(0, heap.get(size()-1));
	        heap.remove(heap.size()-1);

	        int parentIndex = 0;
	        int leftChildIndex = 2*parentIndex+1;
	        int rightChildIndex = 2*parentIndex+2;

	        while(leftChildIndex<heap.size()) {
	            int minIndex = parentIndex;

	            if(heap.get(leftChildIndex) < heap.get(minIndex)) {
	                minIndex = leftChildIndex;
	            }

	            if(rightChildIndex<heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
	                minIndex = rightChildIndex;
	            }
	            if(minIndex == parentIndex) {
	                break;
	            }

	            int temp1 = heap.get(minIndex);
	            heap.set(minIndex, heap.get(parentIndex));
	            heap.set(parentIndex, temp1);

	            parentIndex = minIndex;
	            leftChildIndex = 2*parentIndex+1;
	            rightChildIndex = 2*parentIndex+2;

	        }
	        return temp;
	    }
	}

	class PriorityQueueException extends Exception {

	}
	
	//MAX PRIORITY QUEUE
	
	import java.util.*;

	public class PQ {

	    private ArrayList<Integer> heap;

	    public PQ() {
	        heap = new ArrayList<Integer>();
	    }

	    boolean isEmpty() {
	        return heap.size() == 0;
	    }


	    int getSize() {
	        return heap.size();
	    }

	    int getMax() {
	        
	        if (isEmpty()) {
	            return Integer.MIN_VALUE;
	        }
	        return heap.get(0);
	    }

	    void insert(int element) {

	        heap.add(element);
	        int childIndex = heap.size()-1;
	        int parentIndex = (childIndex-1)/2;

	        while(childIndex>0){

	            if(heap.get(parentIndex)<heap.get(childIndex)){
	                int temp = heap.get(childIndex);
	                heap.set(childIndex, heap.get(parentIndex));
	                heap.set(parentIndex, temp);

	                childIndex = parentIndex;
	                parentIndex = (childIndex-1)/2;

	            }
	            else{
	                return;
	            }
	        }
	    }

	    int removeMax(){

	        if(isEmpty()) {
	            return -1;
	        }
	        int temp = heap.get(0);

	        heap.set(0, heap.get(heap.size()-1));
	        heap.remove(heap.size()-1);

	        int parentIndex = 0;
	        int leftChildIndex = 2*parentIndex+1;
	        int rightChildIndex = 2*parentIndex+2;

	        while(leftChildIndex<heap.size()) {
	            int maxIndex = parentIndex;

	            if(heap.get(leftChildIndex) > heap.get(maxIndex)) {
	                maxIndex = leftChildIndex;
	            }

	            if(rightChildIndex<heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
	                maxIndex = rightChildIndex;
	            }
	            if(maxIndex == parentIndex) {
	                break;
	            }

	            int temp1 = heap.get(maxIndex);
	            heap.set(maxIndex, heap.get(parentIndex));
	            heap.set(parentIndex, temp1);

	            parentIndex = maxIndex;
	            leftChildIndex = 2*parentIndex+1;
	            rightChildIndex = 2*parentIndex+2;

	        }
	        return temp;
	    }
	 
	}
//INPLACE HEAP SORT
	
	import java.util.*;
	public class Solution {

	    public static void inplaceHeapSort(int arr[]) {

	        heapSort(arr);
	    }

	    private static void heapSort(int[] arr) {

	        int n = arr.length;

	        for(int i=(n/2)-1;i>=0;i--) {

	            downHeapify(arr,i,n);

	        }

	        for(int i=n-1;i>=0;i--) {
	            int temp = arr[i];
	            arr[i] = arr[0];
	            arr[0] = temp;
	            downHeapify(arr,0,i);
	        }

	    }

	    private static void downHeapify(int[] arr, int i, int n) {

	        int parentIndex = i;
	        int leftChildIndex = 2*parentIndex+1;
	        int rightChildIndex = 2*parentIndex+2;

	        while(leftChildIndex < n) {
	            int minIndex = parentIndex;

	            if(arr[leftChildIndex] < arr[minIndex]) {
	                minIndex = leftChildIndex;
	            }

	            if(rightChildIndex<n && arr[rightChildIndex] < arr[minIndex]) {
	                minIndex = rightChildIndex;
	            }
	            if(minIndex == parentIndex) {
	                return;
	            }

	            int temp = arr[parentIndex];
	            arr[parentIndex] = arr[minIndex];
	            arr[minIndex] = temp;

	            parentIndex = minIndex;
	            leftChildIndex = 2*parentIndex+1;
	            rightChildIndex = 2*parentIndex+2;

	        }
	    }
	}
	
	//K LARGEST ELEMENTS
	
	import java.util.*;

	public class Solution {

		public static ArrayList<Integer> kLargest(int input[], int k) {
	        
	        int n = input.length;
			
	  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i=0;i<n;i++){
	            pq.add(input[i]);
	        }

	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i=n-1;i>=n-k;i--){
	            list.add(pq.poll());
	        }
	        return list;
		}
	}
	
	//K SMALLEST ELEMENTS
	
	import java.util.*;

	public class Solution {

		public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
			
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i=0;i<n;i++){
	            pq.add(input[i]);
	        }

	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0;i<k;i++){
	            list.add(pq.poll());
	        }
	        return list;
		}
	}
	
	//CHECK MAX HEAP
	
	public class Solution {

		public static boolean checkMaxHeap(int arr[]) {
			
	        return checkMaxHeapHelper(arr,0);
		}
	    
	    private static boolean checkMaxHeapHelper(int[] arr, int startIndex)
	    {
	        
	        if(startIndex==arr.length)
	            return true;
	        
	        
	        int parentIndex=startIndex;
	        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
	        
	        
	        boolean leftAns=true,rightAns=true;
	        
	        
	        if(leftChildIndex<arr.length)
	        {
	            if(arr[parentIndex]<arr[leftChildIndex])
	                return false;
	            else
	                leftAns=checkMaxHeapHelper(arr,leftChildIndex);
	        }
	        
	        
	        if(rightChildIndex<arr.length)
	        {
	            if(arr[parentIndex]<arr[rightChildIndex])
	                return false;
	            else
	                rightAns=checkMaxHeapHelper(arr,rightChildIndex);
	        }
	        
	        //If current parent satisfies the max heap property, then the results for its left and/or right child are 
	        //used to determine if the property is maintained.
	        return (leftAns && rightAns);
	            
	    }
	}
	
	//KTH LARGEST ELEMENT
	
	import java.util.*;
	public class Solution {

		public static int kthLargest(int n, int[] input, int k) {
			
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for(int i=0;i<n;i++){
	            pq.add(input[i]);
	        }
	        int ans = 0;
	        for(int i=0;i<k;i++){
	             ans = pq.poll();
	        }
	        return ans;
		}
	}
	
	//BUY THE TICKET
	
	import java.util.*;
	public class Solution {

	    public static int buyTicket(int arr[], int k) {

	        int time = 0;
	        Queue<Integer> q = new LinkedList<>();
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i =0; i<arr.length; i++){

	            pq.add(arr[i]);
	            q.add(i);
	        }
	        
	        while(!pq.isEmpty()){
	            int b = q.peek();
	            if(arr[q.peek()]==pq.peek()){
	                time++;
	                pq.poll();
	                q.poll();

	                if(b==k){

	                    break;
	                }
	            }else{
	                q.poll();
	                q.add(b);
	            }
	        }
	        return time;

	    }
	}

}
