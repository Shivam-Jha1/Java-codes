package Linked_List;
import java.util.Scanner;
public class Linked_ListUse {

	public static Node<Integer> createLinkedList(){

		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);

		n1.next = n2;
		//	System.out.println(n1+" "+n1.data+" "+n1.next);
		n2.next = n3;
		//	System.out.println(n2+" "+n2.data+" "+n2.next);
		n3.next = n4;
		//	System.out.println(n3+" "+n3.data+" "+n3.next);
		n4.next = null;
		//	System.out.println(n4+" "+n4.data+" "+n4.next);
		return n2;
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


	private static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			temp.data++;
			temp = temp.next;
		}
	}


	private static void print(Node<Integer> head) {

		//Recrsive
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);

		//		while(head!=null) {
		//			System.out.print(head.data+" ");
		//			head = head.next;
		//		}
		//		System.out.println(head.data);
		//		System.out.println(head.next);
		//		System.out.println(head.next.data);
		//		System.out.println(head.next.next.data);
	}

	private static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {

		//Recursive way

		if(head==null && pos>0) {
			return head;
		}

		if(pos==0) {
			Node<Integer> temp = new Node<>(data);
			temp.next = head;
			return temp;
		}
		else {
			head.next = insertNode(head.next,pos-1,data);
			return head;
		}
		//		Node<Integer> newNode = new Node<Integer>(data);
		//		if(pos == 0) {
		//			newNode.next = head;
		//			return newNode;
		//		}
		//		else {
		//			Node<Integer> temp = head;
		//			int count = 0;
		//			while(count<pos-1&&temp != null) {
		//				count++;
		//				temp = temp.next;
		//			}
		//			if(temp!=null) {
		//				newNode.next = temp.next;
		//				temp.next = newNode;
		//			}
		//			return head;
		//		}
	}

	private static void deleteNode(Node<Integer> head, int pos) {
		Node<Integer> temp = head;
		if(pos == 0) {
			temp = temp.next;
		}
		int count = 0;
		while(count<pos-1&&temp!=null) {
			count++;
			temp = temp.next;
		}
		if(temp.next!=null) {
			temp.next = temp.next.next;
		}	
	}

	private static Node<Integer> reverse(Node<Integer> head) {
		
		//RECURSSIVE
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> newNode = reverse(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
		
//		Node<Integer> prev = null;
//		Node<Integer> curr = head;
//		Node<Integer> next;
//		
//		while(curr!=null) {
//			next = curr.next;
//			curr.next = prev;
//			
//			prev = curr;
//			curr = next;
//		}
//		return prev;
	}




	public static void main(String[] args) {

		//	Node<Integer> head = createLinkedList();
		Node<Integer> head = takeInput();
		print(head);
		System.out.println();
		head = reverse(head);
		print(head);
		//		Scanner S = new Scanner(System.in);
		//		int pos = S.nextInt();
		//		int data = S.nextInt();
		//		head = insertNode(head,pos,data);
		//		print(head);
		//		int position = S.nextInt();
		//		deleteNode(head,position);
		//		print(head);


		//		Node<Integer> n1 = new Node<>(10);
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);
		//increment(head);
	}
}












//package Linked_List;
//import java.util.Scanner;
//class Linked_ListUse{
//	public static void main(String[] args){
//		Node<Integer> head = takeInput();
//	//	increment(head);
//		print(head);
//	}
//	public static Node<Integer> takeInput(){
//		Scanner S = new Scanner(System.in);
//		Node<Integer> head = null,tail = null;
//		int data = S.nextInt();
//		Node<Integer> createNode = new Node<Integer>(data);
//
//		while(data!=-1){
//			if(head==null){
//				head = createNode;
//				tail = createNode;
//			}
//			else{
//				tail.next = createNode;
//				tail = createNode;
//			}
//			data = S.nextInt();
//		}
//		return head;
//	}
//	public static void print(Node<Integer> head){
//		
//		while(head!=null){
//			System.out.println(head.data);
//			head = head.next;
//		}
//	}
//}










