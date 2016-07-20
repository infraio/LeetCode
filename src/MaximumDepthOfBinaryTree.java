
public class MaximumDepthOfBinaryTree {

  public static void main(String[] args) {
    TreeNode tree1 = new TreeNode(5);
    TreeNode tree2 = new TreeNode(5);
    TreeNode left = new TreeNode(5);
    TreeNode right = new TreeNode(5);
    tree1.left = left;
    tree1.right = right;
    tree2.left = new TreeNode(5);
    tree2.left.left = new TreeNode(5);
    
    System.out.println(maxDepth(tree1));
    System.out.println(maxDepth(tree2));
  }

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}
