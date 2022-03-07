package Linked_List;

import java.util.Scanner;

public class Merge_sort{

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		head = Merge_sort(head);
		print(head);
	}

	private static void print(Node<Integer> head) {

		//Recrsive
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}

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

	public static Node<Integer> Merge_sort(Node<Integer> head) {
		if(head==null||head.next==null){
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		Node<Integer> head1 = head;
		Node<Integer> head2 = slow.next;
		slow.next = null;

		head1.next =  Merge_sort(head1);
		head2.next =  Merge_sort(head2);
		merge(head1,head2);
		return head;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {

		if(head1==null){
			return head2;
		}
		if(head2==null){
			return head1;
		}
		Node<Integer> t1 = head1;
		Node<Integer> t2 = head2;
		Node<Integer> head = null;
		Node<Integer> tail = null;

		if(t1.data<=t2.data){
			head = t1;
			tail = t1;
			t1 = t1.next;
		}
		else{
			head = t2;
			tail = t2;
			t2 = t2.next;;
		}

		while(t1!=null && t2!=null){
			if(t1.data<=t2.data){
				tail.next = t1;
				tail = t1;
				t1 = t1.next;

			}
			else{
				tail.next  = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		if(t1!=null){
			tail.next = t1;
		}
		else{
			tail.next = t2;
		}
		return head;
	}
}


