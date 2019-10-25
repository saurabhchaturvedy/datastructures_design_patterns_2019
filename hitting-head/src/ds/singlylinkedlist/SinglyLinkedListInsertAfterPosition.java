package ds.singlylinkedlist;

public class SinglyLinkedListInsertAfterPosition {

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
			System.out.println("null");
		}
	}

	public void insertAfterPosition(int position, int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			if (position == 0)
				head = newNode;
		}
		ListNode previous = head;
		int count = 0;
		while (count < position - 1) {
			previous = previous.next;
			count++;
		}
		newNode.next = previous.next;
		previous.next = newNode;
	}

	public void deleteFirst() {
		ListNode temp = head;
		head = head.next;
		temp = null;
	}

	public void deleteLast() {
		ListNode last = head;
		ListNode secondLast = null;
		while (last != null) {
			secondLast = last;
			last = last.next;
		}

		secondLast.next = null;
		
	}
	
	public void deleteAtGivenPosition(int position,int data)
	{
	    ListNode previous =head ;
	    int count =0;
	    while(count<position-1)
	    {
	    	previous = previous.next;
	    	count++;
	    }
	    System.out.println(previous.data);
	    ListNode current = previous.next;
	    System.out.println("node after del node "+previous.next.data);
	    previous.next = current.next;
	    current.next = null;
	   // previous.next = 
	}

	public static void main(String[] args) {
		SinglyLinkedListInsertAfterPosition linkedList = new SinglyLinkedListInsertAfterPosition();
		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		linkedList.display();
		linkedList.insertAfterPosition(3, 75);
		linkedList.display();
		linkedList.deleteFirst();
		linkedList.display();
		linkedList.deleteLast();
		System.out.println("After deletion :");
		linkedList.display();
		linkedList.deleteAtGivenPosition(3,80);
		linkedList.display();
	}
}
