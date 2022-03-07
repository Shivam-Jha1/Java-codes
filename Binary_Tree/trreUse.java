package Binary_Tree;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;
public class trreUse {

	public static void main(String[] args) {

		/*		treeNode<Integer> root = new treeNode<Integer>(4);
		treeNode<Integer> node1 = new treeNode<Integer>(5);
		treeNode<Integer> node2= new treeNode<Integer>(6);
		treeNode<Integer> node3 = new treeNode<Integer>(7);
		treeNode<Integer> node4 = new treeNode<Integer>(8);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);

		node2.children.add(node4);
		System.out.println(root);*/
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		//		treeNode<Integer> root = takeInput(s);
		//		print(root);
		treeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		System.out.println("Number of nodes are "+numNodes(root));
		System.out.println("Sum of nodes are "+sum(root));
		System.out.println("Largest node is "+largestNode(root));
		depthAtK(root,k);
	}

	private static void depthAtK(treeNode<Integer> root,int k) {

		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.print("The nodes at depth k are"+ root.data+" ");
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			depthAtK(root.children.get(i), k-1);
		}
	}

	private static int largestNode(treeNode<Integer> root) {

		if(root == null) {
			return 0;
		}
		int max = root.data;
		for(int i=0;i<root.children.size();i++) {
			int largest = largestNode(root.children.get(i));
			if(largest>max) {
				max = largest;
			}

		}
		return max;
	}

	private static int sum(treeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		int sum = root.data;
		for(int i=0;i<root.children.size();i++){
			sum = sum + sum(root.children.get(i));
		}
		return sum;
	}

	private static int numNodes(treeNode<Integer> root) {

		if(root==null) {
			return 0;
		}
		int count = 1;
		for(int i=0;i<root.children.size();i++) {
			count = count + numNodes(root.children.get(i));
		}

		return count;
	}

	private static void printLevelWise(treeNode<Integer> root) {

		Queue<treeNode<Integer>> queue1 = new LinkedList<>();
		Queue<treeNode<Integer>> queue2 = new LinkedList<>();

		queue1.add(root);
		while(!queue1.isEmpty()) {

			root = queue1.poll();
			System.out.print(root.data+" ");

			for(treeNode<Integer> child : root.children) {
				queue2.add(child);
			}

			if(queue1.isEmpty()) {
				queue1 = queue2;
				queue2 = new LinkedList<>();
				System.out.println();
			}
		}
	}

	private static treeNode<Integer> takeInputLevelWise() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int n = s.nextInt();

		Queue<treeNode<Integer>> list = new LinkedList<>();
		treeNode<Integer> root = new treeNode<Integer>(n);
		list.add(root);

		while(!list.isEmpty()) {

			treeNode<Integer> frontNode = list.poll();

			System.out.println("Enter number of children of "+frontNode.data);
			int numChild = s.nextInt();

			for(int i=0;i<numChild;i++) {

				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
				int child = s.nextInt();
				treeNode<Integer> childNOde = new treeNode<Integer>(child);
				frontNode.children.add(childNOde);
				list.add(childNOde);
			}
		}
		return root;
	}

	private static void print(treeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String s = root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s = s + root.children.get(i).data + " ";
		}
		System.out.println(s);
		for (int i = 0; i <root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	private static treeNode<Integer> takeInput(Scanner s) {

		System.out.println("Enter next node data");
		int n = s.nextInt();

		treeNode<Integer> root = new treeNode<Integer>(n);

		System.out.println("Enter number of children for "+ n);
		int childCount = s.nextInt();

		for (int i = 0; i < childCount; i++) {
			treeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}

		return root;
	}

	/*public static treeNode<Integer> findNextLargerNode(treeNode<Integer> root,int n){
        return findNextLargerNode(root,n,null,Integer.MAX_VALUE,0);
    }
    
	public static treeNode<Integer> findNextLargerNode(treeNode<Integer> root, int n,treeNode<Integer> max,int def,int tempdef){
		
		if(root==null){
            return null;
        }
        
        if(root.data>n){
            tempdef = root.data-n;
            if(tempdef<def){
                def=tempdef;
            max=root;
            }
        }
        for(int i=0;i<root.children.size();i++){
            findNextLargerNode(root.children.get(i),n,max,def,tempdef);
        }
        return max;
}	}*/

}
