package ds.binarytree;

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

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree();
		preOrder(binaryTree.root);
	}
}
