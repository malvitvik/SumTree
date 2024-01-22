public class MaxSumSolution implements Solution {
	private int maxSum = 0;


	@Override
	public int maxSumNodes(TreeNode node) {
		sumNodes(node);
		return maxSum;
	}


	private int sumNodes(TreeNode node) {
		if (node == null)
			return 0;

		int leftSum = sumNodes(node.left);
		int rightSum = sumNodes(node.right);

		maxSum = Math.max(Math.max(maxSum, node.getValue() + leftSum + rightSum),
		                  Math.max(node.getValue() + leftSum, node.getValue() + rightSum));

		return Math.max(Math.max(node.getValue() + leftSum,
		                         node.getValue() + rightSum),
		                node.getValue());
	}
}
