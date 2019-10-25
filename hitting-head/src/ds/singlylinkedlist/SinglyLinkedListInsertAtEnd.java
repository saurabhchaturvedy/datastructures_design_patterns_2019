package ds.singlylinkedlist;

public class SinglyLinkedListInsertAtEnd {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public void insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (current.next !=null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.next;

		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		SinglyLinkedListInsertAtEnd linkedList = new SinglyLinkedListInsertAtEnd();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		linkedList.head.next = second;
		second.next = third;
		linkedList.display();
		linkedList.insertAtEnd(80);
		linkedList.insertAtEnd(85);
		linkedList.display();

	}
}
