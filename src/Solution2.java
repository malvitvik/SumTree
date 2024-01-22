public class Solution2 {
	
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		
		
		return helper(root.left, root.right);
	}
	
	protected boolean helper(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		
		if (left == null || right == null || left.getValue() != right.getValue())
			return false;
		
		return helper(left.left, right.right) && helper(left.right, right.left);
	}
}
