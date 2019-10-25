package ds.stack;

import java.util.EmptyStackException;

public class Stack {

	private int length;
	private ListNode top;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}

	public Stack() {
		// TODO Auto-generated constructor stub
		this.top = null;
		this.length = 0;
	}

	private int length() {
		return length;
	}

	public void push(int item) {
		ListNode stackItem = new ListNode(item);
		stackItem.next = top;
		top = stackItem;
		length++;
	}

	public int pop() {
		if (length == 0)
			throw new EmptyStackException();
		int data = top.data;
		top = top.next;
		length--;
		return data;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int peek() {
		if (length == 0) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(15);
		stack.push(10);
		stack.push(13);
		stack.push(18);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
