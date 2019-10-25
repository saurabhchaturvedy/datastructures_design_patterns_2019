package ds.singlylinkedlist;

public class SinglyLinkedListLoop {

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

	public boolean hasAloop() {

		ListNode fastPointer = head;
		ListNode slowPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if (fastPointer == slowPointer)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		SinglyLinkedListLoop linkedList = new SinglyLinkedListLoop();
		linkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);
		ListNode fifth = new ListNode(60);

		linkedList.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		boolean hasAloop = linkedList.hasAloop();
		System.out.println("This list has a loop ? " + (hasAloop ? "Yes" : "No"));

	}
}
