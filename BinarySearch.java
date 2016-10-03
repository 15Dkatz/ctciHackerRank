package ctciHackerrank;

public class BinarySearch {
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	// not complete implemetation
	public boolean preorder(Node root) {
		while (root.left != null) {
			if (root.data < root.left.data || root.data > root.right.data) {
				return false;
			}
			// search
			return preorder(root.left);
		}

		while (root.right != null) {
			if (root.data < root.left.data || root.data > root.right.data) {
				return false;
			}
			// search
			return preorder(root.right);
		}

		return true;
	}
}
