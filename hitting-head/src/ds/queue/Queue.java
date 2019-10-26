package ds.queue;

import java.util.NoSuchElementException;

public class Queue {

	private int length;
	private ListNode front;
	private ListNode rear;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public Queue() {
		// TODO Auto-generated constructor stub
		front = null;
		rear = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public int dequeue() {
		if (isEmpty())
			throw new NoSuchElementException();
		int node = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		length--;
		return node;
	}

	public void display() {
		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + " -->");
			current = current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();
		queue.dequeue();
		System.out.println();
		queue.display();
	}
}
