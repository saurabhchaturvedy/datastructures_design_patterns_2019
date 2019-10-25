package ds.singlylinkedlist;

public class SinglyLinkedListSearchElement {

	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public boolean searchElement(int element) {
		if (head == null)
			return false;
		ListNode current = head;
		while (current != null) {
			if (current.data == element)
				return true;
			current = current.next;
		}
		return false;

	}

	public static void main(String[] args) {
		SinglyLinkedListSearchElement linkedList = new SinglyLinkedListSearchElement();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		linkedList.head.next = second;
		second.next = third;
		boolean searchElement = linkedList.searchElement(20);
		System.out.println("Element is present in the list --> " + searchElement);
	}
}
