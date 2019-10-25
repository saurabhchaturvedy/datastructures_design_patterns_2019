package ds.singlylinkedlist;

import org.w3c.dom.NodeList;

public class SinglyLinkedListInsertAfterNode {

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
			System.out.println("null");}
		}
		
	
	public void insertAfterNode(ListNode givenNode,int data)
	{
	ListNode newNode = new ListNode(data);
	newNode.next = givenNode.next;
	givenNode.next = newNode;
	}

	public static void main(String[] args) {
		SinglyLinkedListInsertAfterNode linkedList = new SinglyLinkedListInsertAfterNode();
		linkedList.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		linkedList.head.next = first;
		first.next = second;
		second.next = third;
		linkedList.display();
		linkedList.insertAfterNode(second,55);
		linkedList.display();
	}
}
