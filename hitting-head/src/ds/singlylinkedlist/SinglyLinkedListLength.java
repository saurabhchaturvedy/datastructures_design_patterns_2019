package ds.singlylinkedlist;

public class SinglyLinkedListLength {

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

	public int length() {
		if (head == null)
			return 0;
		ListNode current = head;
		int counter = 0;
		while (current.next != null) {
			counter++;
			current = current.next;
		}
		return counter;
	}

	public static void main(String[] args) {
		SinglyLinkedListLength linkedList = new SinglyLinkedListLength();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);

		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		int length = linkedList.length();
		System.out.println("Length of the list is ====> " + length);
	}
}
