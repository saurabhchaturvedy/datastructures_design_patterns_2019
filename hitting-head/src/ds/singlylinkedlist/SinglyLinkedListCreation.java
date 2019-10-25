package ds.singlylinkedlist;

public class SinglyLinkedListCreation {

	ListNode head;

	private static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedListCreation singlyLinkedListCreation = new SinglyLinkedListCreation();
		singlyLinkedListCreation.head.next = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		singlyLinkedListCreation.head.next.next = second;
		second.next = third;
		third.next = fourth;

	}
}
