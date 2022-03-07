package TreeCN;

public class binaryTree1 {

	//sum of nodes
	public class Solution {

	    public static int getSum(BinaryTreeNode<Integer> root) {
	        if(root==null){
	            return 0;
	        }	
	        int leftroot = getSum(root.left);
	        int rightroot = getSum(root.right);
	        return root.data+leftroot+rightroot;
	    }
	}
	
	//preorder binary tree
	public class Solution {

	    public static void preOrder(BinaryTreeNode<Integer> root) {
	        if(root==null){
	            return;
	        }
	        System.out.print(root.data+" ");
	        preOrder(root.left);
	        preOrder(root.right);
	    }
	}
	
	//post order binary tree
	public class Solution {

		public static void postOrder(BinaryTreeNode<Integer> root) {
			if(root==null){
	            return;
	        }
	        postOrder(root.left);
	        postOrder(root.right);
	        System.out.print(root.data+" ");
		}
	}
	
	//nodes greater than x
	public class Solution {

	    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {

	          if(root==null){
	            return 0;
	        }
	        int count=0;
	        if(root.data>x){
	            count++;
	        }
	        return count+countNodesGreaterThanX(root.left,x)+countNodesGreaterThanX(root.right,x);
	    }  
	}
	
	//height of tree
	
	public class Solution {

		public static int height(BinaryTreeNode<Integer> root) {
			if(root==null){
	            return 0;
	        }
	        int countLeft = 0;
	        if(root!=null){
	            countLeft++;
	        }
	        int countRight = 0;
	        if(root!=null){
	            countRight++;
	        }
	        countLeft = countLeft+height(root.left);
	        countRight = countRight+height(root.right);
	        int max = Math.max(countLeft,countRight);
	        return max;
		}
	}
	
	//replace node with depth
	

public class Solution {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	 change(root,0);   
	}
    public static BinaryTreeNode<Integer> change(BinaryTreeNode<Integer> root,int level) {
        if(root==null){
            return null;
        }
        root.data=level;
        change(root.left,level+1);
        change(root.right,level+1);
        return root;
    }
}

//is node present

public class Solution {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        boolean ans = false;
	    if(root==null){
            return ans;
        }
        
        if(root.data==x){
            ans = true;
            return ans;
        }
    
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
        
	}
}

//nodes without sibilings
public class Solution {

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        if(root.left==null){
            System.out.print(root.right.data+" ");
        }
        if(root.right==null){
            System.out.print(root.left.data+" ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}
	
}
