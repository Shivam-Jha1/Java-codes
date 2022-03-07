package Linked_List;

import java.util.Scanner;

public class Find_Node {

	//private static final int Integer = 0;

	private static Node<Integer> takeInput() {

		Scanner S = new Scanner(System.in);
		int data = S.nextInt();
		Node<Integer> head = null,tail = null;

		while(data!=-1) {

			Node<Integer> currentNode = new Node<Integer>(data);

			if(head==null) {
				head = currentNode;
				tail = currentNode;
			}

			else {
				tail.next = currentNode;
				tail = currentNode;
			}

			data = S.nextInt();
		}
		return head;
	}


	private static void print(Node<Integer> head) {

		Node<Integer> temp = head;

		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}


	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		System.out.println("Enter the numbers");
		Node<Integer> head = takeInput();

		System.out.print("You have entered : ");
		print(head);
		System.out.println();

		System.out.println("Enter the number to find its position");
		int n = x.nextInt();

		System.out.println(findNodeRec(head,n));
	}

	private static int findNodeRec(Node<java.lang.Integer> head, int n){//,int count) {
		
		//RECURSSIVE CODE NOW
		
//		if(head==null) {
//			return -1;
//		}
//		if(head.data==n) {
//			return count;
//		}
//		count++;
//		findNodeRec(head.next,n,count);
//		return count;
		
		
		
		
		Node<Integer> temp = head;
		int count = 0;

		while(temp!=null) {

			if(temp.data==n) {
				return count-1;
			}

			temp = temp.next;
			count++;
		}
		return -1;
	}
}
