package ds.singlylinkedlist;

public class SinglyLinkedListMiddleNode {

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

	public int middle() {
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		return slowPointer.data;

	}

	public static void main(String[] args) {
		SinglyLinkedListMiddleNode linkedList = new SinglyLinkedListMiddleNode();
		linkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);

		linkedList.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		int middle = linkedList.middle();
		System.out.println("The middle element is : " + middle);
	}
}
