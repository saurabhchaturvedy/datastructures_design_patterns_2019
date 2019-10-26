package ds.binarytree;

import java.util.Stack;

public class BinaryTree {

	private TreeNode root;

	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);

		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;

	}

	public static void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data + " ");
	}

	public void postOrderIterative(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.push(root);
		while (!nodeStack.isEmpty()) {
			TreeNode item = nodeStack.pop();
			if (item.left != null) {
				nodeStack.push(item.left);
			}
			if (item.right != null) {
				nodeStack.push(item.right);
			}
			System.out.println(item.data + " ");
		}
	}

	public void preOrderIterative() {
		if (root == null)
			return;
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.push(root);
		while (!nodeStack.isEmpty()) {
			TreeNode item = nodeStack.pop();
			System.out.print(item.data + " ");
			if (item.left != null)
				nodeStack.push(item.left);
			if (item.right != null)
				nodeStack.push(item.right);
		}
	}

	public void inOrderIterative(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> nodeStack = new Stack<>();
		TreeNode temp = root;
		while (!nodeStack.isEmpty() || temp != null) {
			if (temp != null) {
				nodeStack.push(temp);
				temp = temp.left;
			} else {
				temp = nodeStack.pop();
				System.out.println(temp.data);
				temp = temp.right;
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree();
		binaryTree.preOrderIterative();
		// binaryTree.preOrderIterative();
	}
}
