package ds.singlylinkedlist;

public class SinglyLinkedListEndNode {

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

	private void display() {
		// TODO Auto-generated method stub
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

	public int nodeFromEnd(int position) {
		ListNode mainPointer = head;
		ListNode referencePointer = head;
		int count = 0;
		while (count < position) {
			referencePointer = referencePointer.next;
			count++;
		}

		while (referencePointer != null) {
			referencePointer = referencePointer.next;
			mainPointer = mainPointer.next;
		}
		return mainPointer.data;

	}

	public static void main(String[] args) {
		SinglyLinkedListEndNode linkedList = new SinglyLinkedListEndNode();
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
		linkedList.display();
		int nodeFromEnd = linkedList.nodeFromEnd(2);
		System.out.println("the node value is " + nodeFromEnd);
	}
}
