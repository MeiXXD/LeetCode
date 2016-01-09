public class MaximumDepthOfBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(1);
		TreeNode d = new TreeNode(1);
		root.left = a;
		a.right = b;
		b.left = c;
		root.right = d;
		System.out.println(maxDepth(root));
	}

	// public static int maxDepth(TreeNode root) {
	// if (root == null) {
	// return 0;
	// }
	// int nLeft = maxDepth(root.left);
	// int nRight = maxDepth(root.right);
	// return nLeft > nRight ? nLeft + 1 : nRight + 1;
	// }
	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth = 0;
		int currentLevelNodes = 1;
		int nextLevelNodes = 0;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			currentLevelNodes--;
			if (node.left != null) {
				queue.add(node.left);
				nextLevelNodes++;
			}
			if (node.right != null) {
				queue.add(node.right);
				nextLevelNodes++;
			}
			if (currentLevelNodes == 0) {
				depth++;
				currentLevelNodes = nextLevelNodes;
				nextLevelNodes = 0;
			}
		}
		return depth;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
