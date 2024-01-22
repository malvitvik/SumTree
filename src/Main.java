public class Main {

	public static void main(String[] args) {

		TreeNode root = TreeNode.createNodes();
		Solution[] solutions = new Solution[] { new RootSumSolution(), new MaxSumSolution() };

		System.out.println(root);
		for (Solution solution : solutions) {
			System.out.println("Sum: " + solution.maxSumNodes(root));
		}
	}
}