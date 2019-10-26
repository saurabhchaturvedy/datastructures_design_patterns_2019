package ds.binarytree;

public class BinarySearchTree {

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

	public void insert(int value) {
		this.root = insert(this.root, value);
	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

	public TreeNode searchBST(TreeNode root, int key) {
		if (root == null || root.data == key)
			return root;

		if (key < root.data) {
			return searchBST(root.left, key);
		} else {
			return searchBST(root.right, key);
		}

	}

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(5);
		binarySearchTree.insert(8);
		binarySearchTree.insert(3);
		binarySearchTree.insert(11);
		binarySearchTree.insert(9);
		binarySearchTree.inOrder(binarySearchTree.root);
		TreeNode searchBST = binarySearchTree.searchBST(binarySearchTree.root, 11);
		System.out.println("Node is " + (searchBST==null?"not found":"key found"));
	}
}
