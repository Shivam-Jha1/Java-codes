package TreeCN;

public class trees {

	//PRINT LEVELWISE
	import java.util.*;
	public class Solution {

		/*	TreeNode structure 
		 * 
		 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/



		public static void printLevelWise(TreeNode<Integer> root){

			if(root==null){
				return;
			}
			Queue<TreeNode<Integer>> q1 = new LinkedList<>();
			Queue<TreeNode<Integer>> q2 = new LinkedList<>();
			q1.add(root);

			while(!q1.isEmpty()){

				root = q1.poll();
				System.out.print(root.data+" ");

				for(int i=0;i<root.children.size();i++){
					q2.add(root.children.get(i));
				}
				if(q1.isEmpty()){
					System.out.println();
					q1 = q2;
					q2 = new LinkedList<>();

				}
			}
		}
	}

	//SUM OF ALL NODES
	import java.util.*;
	public class Solution {



		public static int sumOfAllNode(TreeNode<Integer> root){
			if(root==null){
				return 0;
			}
			int sum = root.data;
			for(int i=0;i<root.children.size();i++){
				sum = sum + sumOfAllNode(root.children.get(i));
			}
			return sum;
		}
	}
	//NUMBER OF NODE GREATER THAN X
	public class Solution {



		public static int numNodeGreater(TreeNode<Integer> root,int x){	

			if(root==null){
				return 0;
			}
			int count = 0;

			if(root.data>x){
				count++;
			}
			for(int i=0;i<root.children.size();i++){

				count = count + numNodeGreater(root.children.get(i),x);
			}
			return count;
		}
	}
//FIND HEIGHT
	import java.util.*;
	public class Solution {

	    /*	TreeNode structure 
		 * 
		 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/

	    public static int getHeight(TreeNode<Integer> root){

	        if(root==null){
	            return 0;
	        }
	        int count = 0;
	        Queue<TreeNode<Integer>> Queue1 = new LinkedList<>();
	        Queue<TreeNode<Integer>> Queue2 = new LinkedList<>();

	        Queue1.add(root);

	        while(!Queue1.isEmpty()){
	            root = Queue1.poll();


	            for(TreeNode<Integer> child: root.children){
	                Queue2.add(child);
	            }

	            if(Queue1.isEmpty()){
	                Queue1 = Queue2;
	                Queue2 = new LinkedList<>();
	                count++;
	            }
	        }
	        return count;
	    }
	}
	
	//COUNT LEAF NODES
	public class Solution {

	    /*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/

	    public static int countLeafNodes(TreeNode<Integer> root){
	        return countLeafNodes(root,0);
	    }
	    public static int countLeafNodes(TreeNode<Integer> root,int count){
	        if(root==null){
	            return 0;
	        }
	        if(root.children.size()==0){
	            return 1;
	        }
	        for(int i=0;i<root.children.size();i++){
	           count+= countLeafNodes(root.children.get(i));
	        }
	        return count;
	    }
	}
//REPLACE NODE WITH DEPTH
	import java.util.*;
	public class Solution {

	    /*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/

	    public static void replaceWithDepthValue(TreeNode<Integer> root){

	        replaceWithDepthValue(root,0);
	    }

	    public static void replaceWithDepthValue(TreeNode<Integer> root,int depth){
	        if(root == null){
	            return;
	        }	

	        root.data = depth;
	        for(int i=0;i<root.children.size();i++){
	            replaceWithDepthValue(root.children.get(i),depth+1);
	        }
	    }
	}

}
