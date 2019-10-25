package ds.singlylinkedlist;

public class SingleLinkedListReverse {

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

	public void display() {
		if (head == null) {
			return;
		} else {
			ListNode current = head;
			while (current != null) {
				System.out.print(current.data + " -->");
				current = current.next;
			}
			System.out.print("null");
		}
	}

	public void reverse() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	public static void main(String[] args) {
		SingleLinkedListReverse linkedList = new SingleLinkedListReverse();
		linkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);

		linkedList.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		linkedList.display();
		linkedList.reverse();
		System.out.println();
		System.out.println("After reversal of the linked list :");
		linkedList.display();

	}
}
