package TreeCN;

public class binaryTree2 {

	//MIRROR BINARY TREE
	import java.util.*;
	public class Solution {

	    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return;
	        }
	        BinaryTreeNode<Integer> temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        mirrorBinaryTree(root.left);
	        mirrorBinaryTree(root.right);

	    }
	}
	
	//DIAMETER OF BINARY TREE
	
	import java.util.*;
	public class Solution {

	    public static int height(BinaryTreeNode<Integer> root) {
	        if(root==null) {
	            return 0;
	        }
	        return Math.max(height(root.left),height(root.right))+1;
	    }

	    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
	        if(root==null) {
	            return 0;
	        }

	        int left = height(root.left);
	        int right = height(root.right);
	        int max1 = left+right+1;

	        int leftDiameter = diameterOfBinaryTree(root.left);
	        int rightDiameter = diameterOfBinaryTree(root.right);

	        return Math.max(max1, Math.max(leftDiameter, rightDiameter));

	    }
	}
	
	//PRINT LEVEL WISE
	
	import java.util.*;
	public class Solution {

	    public static void printLevelWise(BinaryTreeNode<Integer> root) {
	        if(root==null){
	            return;
	        }	
	        Queue<BinaryTreeNode<Integer>> node = new LinkedList<BinaryTreeNode<Integer>>();
	        node.add(root);
	        while(!node.isEmpty()){

	            BinaryTreeNode<Integer> front = node.poll();
	            System.out.print(front.data+":");

	            if(front.left!=null) {
	                node.add(front.left);
	                System.out.print("L:"+front.left.data+",");
	            }
	            if(front.left==null){
	                System.out.print("L:"+"-1"+",");
	            }

	            if(front.right!=null) {
	                node.add(front.right);
	                System.out.print("R"+":"+front.right.data);
	            }
	            if(front.right==null){
	                System.out.print("R:"+"-1");
	            }
	            System.out.println();   
	        }
	    }
	}
	
	//CONSTRUCT TREE USING INORDER PREORDER
	
	public class Solution {

	    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
	        return BuildTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	    }

	    public static BinaryTreeNode<Integer> BuildTree(int[] preOrder, int[] inOrder,int siPre,int eiPre,int siIn,int eiIn){
	        if(siPre>eiPre || siIn>eiIn){
	            return null;
	        }
	        int temp = preOrder[siPre];
	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
	        
	        int ri = -1;
	        for(int i=siIn;i<=eiIn;i++){
	            if(inOrder[i]==temp){
	                ri = i;
	                break;
	            }
	        }

	        int siPreleft = siPre+1;
	        int siInleft = siIn;
	        int eiInleft = ri-1;
	        int eiPreRight = eiPre;
	        int siInRight = ri+1;
	        int eiInRight = eiIn;
	        
	        int leftsubtree = eiInleft-siInleft+1;
	        
	        int eiPreleft = siPreleft+leftsubtree-1;
	        int siPreRight = eiPreleft+1;
	        
	        root.left = BuildTree(preOrder,inOrder,siPreleft,eiPreleft,siInleft,eiInleft);
	        root.right = BuildTree(preOrder,inOrder,siPreRight,eiPreRight,siInRight,eiInRight);
	        
	        return root;
	    }
	}
	
	//CONSTRUCT TREE USING POSTORDER INORDER
	
	public class Solution {

		public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
			//Your code goes here
	        
	        return result(inOrder,postOrder,0,inOrder.length-1,0,postOrder.length-1);
		}
	    
	    public static BinaryTreeNode<Integer> result(int[] inOrder,int[] postOrder,int inStart,int inEnd,int postStart,int postEnd){
	        if(inStart>inEnd || postStart>postEnd){
	            return null;
	        }
	        int index=0;
	        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(postOrder[postEnd]);  
	    for(int i=inStart;i<=inEnd;i++){
	        if(inOrder[i]==root.data){
	            index=i;
	        }
	    }
	        int leftPostEI= postStart + index - inStart -1;
	        root.left=result(inOrder,postOrder,inStart,index-1,postStart,leftPostEI);
	        root.right=result(inOrder,postOrder,index+1,inEnd,leftPostEI+1,postEnd-1);
	        return root;
	    }

	}
	
	//CREATE AND INSERT DUPLICATE NODE
	
	public class Solution {

	    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
	        
	        BinaryTreeNode<Integer> oldleft;
	        
	        if(root==null){
	            return;
	        }

	        insertDuplicateNode(root.left);
	        insertDuplicateNode(root.right);

	        oldleft = root.left;
	        root.left = new BinaryTreeNode(root.data);
	        root.left.left = oldleft;

	    }
	}
	
	//MINIMUM AND MAXIMUM IN BINARY TREE
	
	import java.util.*;
	public class Solution {

	    public static int findmax(BinaryTreeNode<Integer> root){
	        if (root == null) 
	            return Integer.MIN_VALUE; 
	  
	        int res = root.data; 
	        int lres = findmax(root.left); 
	        int rres = findmax(root.right); 
	  
	        if (lres >= res) 
	            res = lres; 
	        if (rres >= res) 
	            res = rres; 
	        return res; 
	    }
	        public static int findmin(BinaryTreeNode<Integer> root){
	        if (root == null) 
	            return Integer.MAX_VALUE; 
	  
	        int res = root.data; 
	        int lres = findmin(root.left); 
	        int rres = findmin(root.right); 
	  
	        if (lres <= res) 
	            res = lres; 
	        if (rres <= res) 
	            res = rres; 
	        return res; 
	    }
	    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

	        
	        int max=findmax(root);
	        int min=findmin(root);
	        Pair <Integer, Integer> ans = new Pair <Integer, Integer> (min, max);
	        return ans;
	    }
	}
	
	//LEVEL ORDER TRACERSAL
	
	import java.util.*;
	public class Solution {

	    public static void printLevelWise(BinaryTreeNode<Integer> root) {
	        if(root==null){
	            return;
	        }
	        Queue<BinaryTreeNode<Integer>> Node = new LinkedList<BinaryTreeNode<Integer>>();

	        Node.add(root);
	        Node.add(null);
	        System.out.println(root.data);
	        while(!Node.isEmpty()){

	            BinaryTreeNode<Integer> front = Node.poll();
	            if(front==null){
	                System.out.println();
	                if(!Node.isEmpty()){
	                    Node.add(null);
	                }
	            }
	            else
	            {        
	                if(front.left!=null){
	                    Node.add(front.left);
	                    System.out.print(front.left.data+" ");
	                }
	                if(front.right!=null){
	                    Node.add(front.right);
	                    System.out.print(front.right.data+" ");
	                }
	            }
	        }
	    }
	}

	//PATH SUM TO LEAF
	
	import java.util.ArrayList;
	public class Solution {
	   

		public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

	        ArrayList<Integer> arr=new ArrayList<Integer>();
	        String str="";
	        path1(root,k,str);
	        return;
	        
		}
	    public static void path1(BinaryTreeNode<Integer> root,int k,String str){
	        if(root==null){
	            return;
	        }
	         str+=root.data+" ";
	        if(root.left==null && root.right==null){
	            if(k==root.data){
	                System.out.print(str+" ");
	                System.out.println();
	            }
	        }
	        path1(root.left,k-root.data,str);
	        path1(root.right,k-root.data,str);
	        return;
	    }
	}
	
	//PRINT NODES AT DISTANCE K FROM NODE
	
	public class Solution {

	    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {

	        nodesAtDistanceKWithRootDistance(root, node, k);
	    }

	    public static int nodesAtDistanceKWithRootDistance(BinaryTreeNode<Integer> root,int node,int k) {

	        if(root==null){
	            return -1;
	        }

	        if(root.data == node) {

	            printNodesDown(root,k);
	            return 0;
	        }
	        int leftHeight = nodesAtDistanceKWithRootDistance(root.left, node, k);
	        
	        if(leftHeight!=-1) {
	            
	            if(leftHeight+1 == k) {
	                System.out.println(root.data);
	            }
	            
	            else {
	                printNodesDown(root.right, k-leftHeight-2);
	            }
	            
	            return leftHeight+1;
	        }
	        
	        int rightHeight = nodesAtDistanceKWithRootDistance(root.right, node, k);
	        
	        if(rightHeight!=-1) {
	            
	            if(rightHeight+1 == k) {
	                System.out.println(root.data);
	            }
	            
	            else {
	                printNodesDown(root.left, k-rightHeight-2);
	            }
	            return rightHeight+1;
	        }
	        return -1;

	    }

	    private static void printNodesDown(BinaryTreeNode<Integer> root, int k) {
	        
	        if(root==null) {
	            return ;
	        }
	        if(k==0) {
	            System.out.println(root.data);
	            return ;
	        }
	        printNodesDown(root.left, k-1);
	        printNodesDown(root.right, k-1);
	    }
	}
}
