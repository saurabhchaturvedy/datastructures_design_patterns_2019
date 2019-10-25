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

	public void removeDuplicateFromSortedList() {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				{
					current = current.next;
				}
			}
		}
	}

	public void insertElementInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		boolean isInserted = false;
		while (current != null || !isInserted) {
			if (current.data < value && (current.next == null || current.next.data > value)) {
				newNode.next = current.next;
				current.next = newNode;
				isInserted = true;
			} else {
				current = current.next;
			}
		}
	}

	public void removeElementFromSortedList(int value) {
		ListNode current = head;
		ListNode behind = null;

		while (current != null && current.data != value) {
			behind = current;
			current = current.next;
		}

		if (current == null)
			return;
		else
			behind.next = current.next;
	}

	public static void main(String[] args) {
		SinglyLinkedListEndNode linkedList = new SinglyLinkedListEndNode();
		linkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(20);
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
		linkedList.removeDuplicateFromSortedList();
		linkedList.display();
		linkedList.insertElementInSortedList(300);
		System.out.println();
		System.out.println("After inserting one element in the sorted list :");
		System.out.println();
		linkedList.display();
		linkedList.removeElementFromSortedList(50);
		linkedList.display();
	}
}
