package ds.singlylinkedlist;

public class SinglyLinkedListPrintElements {

	private ListNode head;

	static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public static void print(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		SinglyLinkedListPrintElements linkedList = new SinglyLinkedListPrintElements();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		print(linkedList.head);
	}
}
