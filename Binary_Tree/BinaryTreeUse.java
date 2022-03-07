package Binary_Tree;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> InputLevelWise(){

		Scanner S = new Scanner(System.in);
		System.out.println("Enter root of tree");
		int rootData = S.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> ConnectNode = new LinkedList<BinaryTreeNode<Integer>>();

		ConnectNode.add(root);
		while(!ConnectNode.isEmpty()){
			BinaryTreeNode<Integer> front = ConnectNode.poll();

			System.out.println("Enter left child of " + front.data);
			int left = S.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				ConnectNode.add(leftChild);
			}

			System.out.println("Enter right child of " + front.data);
			int right = S.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				ConnectNode.add(rightChild);
			}
		}
		return root;
	}

	public static BinaryTreeNode<Integer> Input(boolean isroot,int parentData,boolean isleft){
		if(isroot) {
			System.out.println("Enter the root of tree");
		}else {
			if(isleft) {
				System.out.println("Enter left node "+ parentData);
			}
			else {
				System.out.println("Enter right node "+ parentData);
			}
		}
		Scanner S = new Scanner(System.in);
		int data = S.nextInt();

		if(data==-1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		BinaryTreeNode<Integer> leftnode = Input(false,data,true);
		BinaryTreeNode<Integer> rightnode = Input(false,data,false);
		root.left = leftnode;
		root.right = rightnode;
		return root;
	}

	//	public static BinaryTreeNode<Integer> input(){
	//		
	//		System.out.println("Enter rhe root of tree");
	//		Scanner S = new Scanner(System.in);
	//		int data = S.nextInt();
	//		
	//		if(data==-1) {
	//			return null;
	//		}
	//		
	//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
	//		BinaryTreeNode<Integer> leftnode = input();
	//		BinaryTreeNode<Integer> rightnode = input();
	//		root.left = leftnode;
	//		root.right = rightnode;
	//		return root;
	//	}

	public static void printTreeDetailed(BinaryTreeNode<Integer> root){

		if(root==null) {
			return;
		}

		System.out.print(root.data+" : ");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+"  ");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	//	public static void printTree(BinaryTreeNode<Integer> root){
	//		
	//		if(root==null) {
	//			return;
	//		}
	//		
	//		System.out.println(root.data);
	//		
	//		printTree(root.left);
	//		printTree(root.right);
	//	}

	private static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(Math.abs(leftHeight-rightHeight)>1) {
			return false;
		}
		return true;
	}

	private static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+height(root.left)+height(root.right);

	}

	private static int noOfLeaf(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return noOfLeaf(root.left)+noOfLeaf(root.right);


	}

	private static int largestNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int left = largestNode(root.left);
		int right = largestNode(root.right);
		return Math.max(root.data, Math.max(left,right));
	}

	private static int numNodes(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return 0;
		}
		int leftnode = numNodes(root.left);
		int rightnode = numNodes(root.right);
		return 1+leftnode+rightnode;
	}

	public static BinaryTreeNode<Integer> BinTreeFromPreIn(int[] pre,int[] in){

		BinaryTreeNode<Integer> root = BinaryTreeFromPreInHelper(pre,in,0,pre.length-1,0,in.length-1);
		return root;
	}

	private static BinaryTreeNode<Integer> BinaryTreeFromPreInHelper(int[] pre, int[] in, int siPre, int endPre, int siIn,
			int endIn) {

		if(siPre>endPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode root = new BinaryTreeNode<>(rootData);

		int rootIndex = -1;
		for(int i = siIn;i<=endIn;i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int siPreleft = siPre+1;
		int siInleft = siIn;
		int endPreleft;
		int endInleft = rootIndex-1;

		int siPreright;
		int siInright = rootIndex+1;
		int endPreright = endPre;
		int endInright = endIn;

		int leftSubtree = endInleft-siInleft+1;

		endPreleft = siPreleft+leftSubtree-1;
		siPreright = endPreleft+1;

		BinaryTreeNode<Integer> left =  BinaryTreeFromPreInHelper(pre,in,siPreleft,endPreleft,siInleft,endInleft);
		BinaryTreeNode<Integer> right = BinaryTreeFromPreInHelper(pre,in,siPreright,endPreright,siInright,endInright);
		root.left = left;
		root.right = right;
		return root;
	}


	private static boolean isBst(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return true;
		}

		int leftMax = maximum(root.left);
		if(leftMax>=root.data) {
			return false;
		}

		int rightMin = minimum(root.right);
		if(rightMin<root.data) {
			return false;
		}
		boolean isLeft = isBst(root.left);
		boolean isRigth = isBst(root.right);
		return  isLeft && isRigth; 
	}

	private static int minimum(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMIn = minimum(root.left);
		int rightMIn = minimum(root.right);

		return Math.min(root.data, Math.min(leftMIn, rightMIn));
	}

	private static int maximum(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return Integer.MIN_VALUE;
		}

		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}

	private static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = 0;
			ans.isBalanced = true;
			return ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);

		boolean isBal = true;
		int height = 1+Math.max(leftOutput.height,rightOutput.height);

		if(Math.abs(leftOutput.height-rightOutput.height)>1) {
			isBal = false;
		}

		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}

		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = 0;
		ans.isBalanced = true;
		return ans;
	}
	
	
	

	private static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		root.left = removeLeafNode(root.left);
		root.right = removeLeafNode(root.right);
		return root;
	}
	static int max = 0;
	private static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}

		int left = height(root.left);
		int right = height(root.right);
		int max = Math.max(left, right)+1;

		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);

		return Math.max(max, Math.max(leftDiameter, rightDiameter));

	}

	public static void main(String[] args) {

		//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		//
		//		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<>(2);
		//		BinaryTreeNode<Integer> rootright = new BinaryTreeNode<>(3);
		//
		//		root.left = rootleft;
		//		root.right = rootright;
		//		
		//		BinaryTreeNode<Integer> tworight = new BinaryTreeNode<>(4);
		//		BinaryTreeNode<Integer> threeleft = new BinaryTreeNode<>(5);
		//		
		//		rootleft.right = tworight;
		//		rootright.left = threeleft;
		//	BinaryTreeNode<Integer> root = Input(true,0,true);
		BinaryTreeNode<Integer> root  = InputLevelWise();
		printLevelWise(root);
		System.out.println();
//		printTreeDetailed(root);
//		System.out.println("Number of nodes is = " + numNodes(root));
//		System.out.println("Largest node is = "+largestNode(root));
//		System.out.println("Number of leaf nodes = "+noOfLeaf(root));
//		System.out.println("Height of tree = "+height(root));

		//System.out.println("Is this tree balanced ? " + isBalanced(root));

//		System.out.println("Is this tree balanced ? " + isBalancedBetter(root).isBalanced);
		//System.out.println("IS BST ? " + isBst(root));
//		isBstReturn ans = isBstBetter(root);
//		System.out.println("Min value = "+ans.min+" Max value =  "+ans.max+" is Balanced ?  "+ans.isBST);
	//	constructLinkedList(root);
		//	System.out.println("Diameter of binary tree : " + diameter(root));
		//		BinaryTreeNode<Integer> newRoot = removeLeafNode(root);
		//		printTreeDetailed(newRoot);
		//		System.out.println("Here is the tree used making pre and in order : ");
		//		int in[] = {4 ,2 ,5 ,1 ,6 ,3 ,7};
		//		int pre[] = {1,2,3,4,5,6,7};
		//		root =  BinTreeFromPreIn(pre,in);

	}
//NNEDS IMPROVMENT	
	 public static void printLevelWise(BinaryTreeNode<Integer> root) {

	        if(root==null){
	            return;
	        }
	        Queue<BinaryTreeNode<Integer>> q1 = new LinkedList<BinaryTreeNode<Integer>>();
	        Queue<BinaryTreeNode<Integer>> q2 = new LinkedList<BinaryTreeNode<Integer>>();
	        q1.add(root);

	        while(!q1.isEmpty()){

	            BinaryTreeNode<Integer> newRoot = q1.poll();
	            System.out.print(newRoot.data+" ");

	            if(newRoot.left!=null){
	                q2.add(newRoot.left);
	            }
	            if(newRoot.right!=null){
	                q2.add(newRoot.right);
	            }
	            if(q1.isEmpty()){
	                q1=q2;
	                q2=new LinkedList<BinaryTreeNode<Integer>>();
	                System.out.println();
	            }
	        }
	    }
	
	private static isBstReturn isBstBetter(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			isBstReturn ans = new isBstReturn(Integer.MAX_VALUE,Integer.MIN_VALUE, true);
			return ans;
		}
		
		isBstReturn leftans = isBstBetter(root.left);
		isBstReturn rightAns = isBstBetter(root.right);
		
		int min = Math.min(root.data, Math.min(leftans.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftans.max, rightAns.max));
		
		boolean isBST = true;
		if(leftans.max>=root.data) {
			isBST = false;
		}
		if(rightAns.min<root.data) {
			isBST = false; 
		}
		if(!leftans.isBST && !rightAns.isBST) {
			isBST = false;
		}
		isBstReturn ans = new isBstReturn(min, max, isBST);
		return ans;
	}
}
