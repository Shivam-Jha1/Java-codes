package TreeCN;

public class BST1 {
	
	//SEARCH IN BST
	public class Solution {
		
	   public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
	        return searchInBST(root,k,false);
	    }
	    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k,boolean ans) {
	        if(root==null){
	            return false;
	        }
	        if(k==root.data){
	            ans = true;
	        }
	        if(k<root.data){
	            ans = searchInBST(root.left,k);
	        }
	        if(k>root.data){
	            ans =   searchInBST(root.right,k);
	        }
	        return ans;
	    }
	}
	
	//ELEMENTS BETWEEN K1 AND K2
	
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        
       /* ArrayList<Integer> ans = new ArrayList<>();
        elementsInRangeK1K2(root,k1,k2,ans);
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
           System.out.print(ans.get(i)+" ");
        }
    }
    
 public static ArrayList<Integer> elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2,ArrayList<Integer> ans){
        if(root==null){
            return null;
        }	

        if(root.data>=k1 && root.data<=k2){
            ans.add(root.data);
        }

        if(root.data>k2){
            elementsInRangeK1K2(root.left,k1,k2,ans);
        }

       else if(root.data<k1){
            elementsInRangeK1K2(root.right,k1,k2,ans);
        }
        else{
            elementsInRangeK1K2(root.left,k1,k2,ans);
            elementsInRangeK1K2(root.right,k1,k2,ans);
        }
     return ans;
    }
}*/
    	
        public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

            if(root==null){
                return;
            }
            
            if(root.data>=k1 && root.data<=k2){
                elementsInRangeK1K2(root.left,k1,k2);
                System.out.print(root.data+" ");
                elementsInRangeK1K2(root.right,k1,k2);
            }
            else if(root.data<k1){
                elementsInRangeK1K2(root.right,k1,k2);
            }
            else if(root.data>k2){
                elementsInRangeK1K2(root.left,k1,k2);
            }
        }
    }

//CONSTRUCT BST


public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
    
    return SortedArrayToBST(arr,0,n-1);
}
public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start,int end){	
    
    if(arr.length==1){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[0]);
        return root;
    }
    
    if(start>end){
        return null;
    }
    
    int mid = (start+end)/2;

    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

    root.left = SortedArrayToBST(arr,start,mid-1);
    root.right = SortedArrayToBST(arr,mid+1,end);
    return root;
}
}

//BST TO LL

import java.util.*;
public class Solution {

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        if(root == null)
            return null;
        
        LinkedListNode<Integer> newHead = constructLinkedList(root.left);
        LinkedListNode<Integer> temp = newHead;
        
        if(newHead == null)
            newHead = new LinkedListNode<>(root.data);
        
        else
        {			
            while(temp != null && temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new LinkedListNode<>(root.data);
        }
        LinkedListNode<Integer> rightHead = constructLinkedList(root.right);
        
        if(newHead.next == null)
            newHead.next = rightHead;
        else
            temp.next.next = rightHead;
        return newHead;
    }
}

//LCA TO BST

public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
	if(root==null){
        return -1;
    }
    if(a<root.data && b<root.data){
        return getLCA(root.left,a,b);
    }
    
    else if(a>root.data && b>root.data){
        return getLCA(root.right,a,b);
    }
    else{
        return root.data;
    }
}
}

//REPLACE WITH SUM OF GREATER NODES

public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
    helper(root,0);
}
public static int helper(BinaryTreeNode<Integer> root,int sum) {

    if(root==null) {
        return 0;
    }
    int sumOfGreaterNodes = helper(root.right,sum);
    int temp = root.data;
    root.data += sumOfGreaterNodes + sum;
    int leftSum  = helper(root.left,root.data);
    return temp + leftSum+ sumOfGreaterNodes ;

}
}

//FIND PATH IN BST
public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){

    if(root==null){
        return null;
    }
    
    if(root.data==data){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(root.data);
        return ans;
    }
    
    ArrayList<Integer> leftAns = getPath(root.left,data);
    if(leftAns!=null){
        leftAns.add(root.data);
        return leftAns;
    }
    ArrayList<Integer> rightAns = getPath(root.right,data);
    if(rightAns!=null){
        rightAns.add(root.data);
        return rightAns;
    }
    return null;
}
}
//BST CLASS

import java.util.*;
public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;
	
	private BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if(root==null)
        {
            BinaryTreeNode<Integer> newnode=new BinaryTreeNode<Integer>(data);
            return newnode;
                
        }
        if(data<=root.data)
        {
            root.left=insertData(data,root.left);
        }
        if(data>root.data)
        {
            root.right=insertData(data,root.right);
        }
        return root;
	}
	
	public void insert(int data) {
		root = insertData(data, root);
	}
	
	public void remove(int data) {
		//Implement the remove() function
        root=remove(root,data);
	}
     public BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root,int data)
     {
         if(root==null)
         {
             return null;
         }
         //ab khel start hoga
         if(root.data==data)
         {
             if(root.left==null&&root.right==null)
             {
                 return null;
             }
             if(root.left==null)
             {
                 return root.right;
             }
             if(root.right==null)
             {
                 return root.left;
             }
             else
             {
                 //bahut sahi logic laga diya bhai sahab
                 
				BinaryTreeNode<Integer> temp = root.right;
				while(temp.left!=null) {
					temp = temp.left;
				}
				int tempData = temp.data;
				root.data = tempData;
				root.right = remove(root.right,tempData);
				return root;
             }
         }
         if( data < root.data ) {
			
			root.left = remove(root.left, data);
			
		}
		else {
			root.right  = remove(root.right, data);
		}
		return root;
     }
    

	public void printTree() {
		//Implement the printTree() function
        printTree(root);
	}
    public void printTree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+":");
       
        if(root.left!=null)
        {
            System.out.print("L:"+root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
        
    }
	
	public boolean search(int data) {
		//Implement the search() function
        return search(root,data);
        
	}
    public boolean search(BinaryTreeNode<Integer> root,int data)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==data)
        {
            return true;
        }
        if(data<root.data)
        {
            return search(root.left,data);
        }
        if(data>root.data)
        {
            return search(root.right,data);
        }
        return false;
    }
	
}

//LEVEL WISE LINKED LIST

import java.util.*;

public class Solution {
    /*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    /*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        
        ArrayList<LinkedListNode<Integer>>ans = new ArrayList();
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        if(root==null)
            return ans;
        q.add(root);
        
        while(!q.isEmpty()){
            
         int   levelNodes = q.size();
            LinkedListNode<Integer> head = null;
            LinkedListNode<Integer> curr = null;
            
            while(levelNodes>0){
                
              BinaryTreeNode<Integer> n = q.remove();
                LinkedListNode ln = new LinkedListNode(n.data);
                
                if(head==null){
                    head = ln;
                    curr = ln;
                }
                else{
                    curr.next = ln;
                    curr = curr.next;
                }
                
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                levelNodes--;
            }			
            ans.add(head);
        }
        return ans;
    }
}

//LARGEST BST

import java.util.*;
public class Solution {
    /*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        
        if (root==null)
            return 0;

        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return findHeight(root);
        else
        {
            return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
        }

    }

    private static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
            return 0;

        if (root.left==null && root.right==null)
            return 1;

        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }

    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max)
    {
        if(root == null)
            return true;

        if(root.data < min || root.data > max)
            return false;
        else
            return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
    }

}

//PAIR SUM IN BST

import java.util.*;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        if(root==null) {
            return ;
        }

        Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
        BinaryTreeNode<Integer> temp = root;
        while(temp!=null){
            stack1.push( temp  );
            temp = temp.left;
        }
        temp =root;
        while(temp!=null){
            stack2.push( temp  );
            temp = temp.right;
        }

        while( !stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek().data < stack2.peek().data) ) {

            BinaryTreeNode<Integer> frontNode1 = stack1.peek(),frontNode2 = stack2.peek();

            if(frontNode1.data + frontNode2.data == s) {

                System.out.println( frontNode1.data +" " + frontNode2.data );
                stack1.pop();
                stack2.pop();
                    
                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }

                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                  
                }
            }

            else if( frontNode1.data + frontNode2.data  < s  ) {
                stack1.pop();
                            
                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }
            }
            else {
                stack2.pop();
                    
                
                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                }
            }
        }
    }	
}

}
