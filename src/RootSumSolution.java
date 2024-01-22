public class RootSumSolution implements Solution{

	@Override
	public int maxSumNodes(TreeNode node) {
		if (node == null)
			return 0;

		return node.getValue() + Math.max(maxSumNodes(node.left), maxSumNodes(node.right));
	}
}
