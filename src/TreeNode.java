import java.util.Random;

public class TreeNode {
	public TreeNode left, right;
	
	private int value;
	
	public TreeNode(int value) {
		this.value = value;
	}
	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public int getValue() {
		return value;
	}


	@Override 
	public String toString() {
		return "%d:{%s %s}".formatted(value, left, right);
	}

	public static TreeNode createNodes(Random random, int depth) {
		if (depth == 0)
			return null;

		TreeNode node = new TreeNode(random.nextInt(-100, 100));
		node.left = createNodes(random, Math.min(depth - 1, random.nextInt(8)));
		node.right = createNodes(random, Math.min(depth - 1, random.nextInt(8)));

		return node;
	}


	public static TreeNode createNodes() {
		Random random = new Random();
		int depth =  random.nextInt(8);
		return createNodes(random, depth);
	}
}
