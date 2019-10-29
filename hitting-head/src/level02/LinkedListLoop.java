package level02;

public class LinkedListLoop {

	ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	private void detectLoop() {
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if (slowPointer == fastPointer)
				break;

		}
		System.out.println("List has a loop");
		removeLoop(fastPointer, head);
		System.out.println("Loop is removed");
	}

	private void removeLoop(ListNode fastPointer, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode ptr1 = fastPointer;
		ListNode ptr2 = fastPointer;

		int length = 1;
		while (ptr1.next != ptr2) {
			ptr1 = ptr1.next;
			length++;
		}

		ptr1 = head;
		ptr2 = head;

		for (int i = 0; i < length; i++) {
			ptr2 = ptr2.next;
		}

		while (ptr2.next != ptr1.next) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		ptr2.next = null;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedListLoop linkedListLoop = new LinkedListLoop();
		linkedListLoop.head = new ListNode(20);
		ListNode first = new ListNode(30);
		ListNode second = new ListNode(40);
		ListNode third = new ListNode(50);

		linkedListLoop.head.next = first;
		first.next = second;
		second.next = third;
		third.next = second;

		//linkedListLoop.display();
		linkedListLoop.detectLoop();
		linkedListLoop.display();

	}
}
