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

	public void hasAloop() {

		ListNode fastPointer = head;
		ListNode slowPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if (fastPointer == slowPointer) {
				System.out.println("List has a loop , going to break it ...");
				int findLoopLength = findLoopLength(fastPointer, slowPointer);
				System.out.println("Loop length is " + findLoopLength);
				breakLoop(fastPointer, slowPointer);
			}
		}
		return;

	}

	private void breakLoop(ListNode fastPointer, ListNode slowPointer) {
		// TODO Auto-generated method stub

		slowPointer = slowPointer.next;
		while (slowPointer.next != fastPointer) {
			slowPointer = slowPointer.next;
		}
		slowPointer.next = null;
		System.out.println("Loop has broken...");
		display();

	}

	private int findLoopLength(ListNode fastPointer, ListNode slowPointer) {
		slowPointer = slowPointer.next;
		int length = 1;
		while (slowPointer != fastPointer) {
			slowPointer = slowPointer.next;
			length++;

		}
		return length;
		// TODO Auto-generated method stub

	}

	private void display() {
		// TODO Auto-generated method stub
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.next;

		}
		System.out.print("null");
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
		fourth.next = second;

		linkedList.hasAloop();

	}
}
