package ds.singlylinkedlist;

public class SinglyLinkedListInsertAtBegining {

	private Listnode head;

	private static class Listnode {
		int data;
		Listnode next;

		public Listnode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public void insertAtBegining(Listnode node) {
		Listnode newNode = new Listnode(40);
		newNode.next = head;
		head = newNode;
	}

	public void display() {
		Listnode current = head;
		while (current.next != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		SinglyLinkedListInsertAtBegining linkedList = new SinglyLinkedListInsertAtBegining();
		linkedList.head = new Listnode(10);
		Listnode second = new Listnode(20);
		Listnode third = new Listnode(30);
		Listnode newNode = new Listnode(40);
		linkedList.head.next = second;
		second.next = third;
		linkedList.display();
		linkedList.insertAtBegining(newNode);
		linkedList.display();

	}
}
