package Linked_List;
import java.util.Scanner;
public class Even_After_Odd {



	public static void main(String[] args) {

		System.out.println("Enter the numbers");
		Node<Integer> head = takeInput();
		System.out.println();

		System.out.print("The list is : ");
		print(head);
		System.out.println();

		head = 	evenAfterNode(head);

	}



	private static Node<Integer> evenAfterNode(Node<Integer> head) {
		
		
		
		return null;
	}



	private static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}

	private static Node<Integer> takeInput() {
		Scanner S = new Scanner(System.in);
		int data = S.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;
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

}
