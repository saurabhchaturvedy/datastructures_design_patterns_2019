package ds.doublylinkedlist;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;

	int length;

	private static class ListNode {
		private ListNode next;
		private ListNode previous;
		int data;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		length = 0;
	}

	private boolean isEmpty() {
		return length == 0;
	}

	private int length() {
		return length;
	}

	private void printForward() {
		ListNode last = tail;
		while (last != null) {
			System.out.print(last.data + " -->");
			last = last.previous;
		}
		System.out.print("null");
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		doublyLinkedList.head.next = first;
		doublyLinkedList.head.previous = null;
		first.previous = doublyLinkedList.head;
		first.next = second;
		second.next = third;
		second.previous = first;
		third.previous = second;
		doublyLinkedList.tail = third;

		doublyLinkedList.printForward();
		doublyLinkedList.insertFirst(94);
		doublyLinkedList.printForward();

	}
}
