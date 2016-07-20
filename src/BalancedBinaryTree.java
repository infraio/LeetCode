
public class BalancedBinaryTree {

  public static void main(String[] args) {
    TreeNode tree1 = new TreeNode(5);
    TreeNode tree2 = new TreeNode(5);
    TreeNode left = new TreeNode(5);
    TreeNode right = new TreeNode(5);
    tree1.left = left;
    tree1.right = right;
    tree2.left = left;
    tree2.left.left = right;
    
    System.out.println(isBalanced(tree1));
    System.out.println(isBalanced(tree2));
  }

  public static boolean isBalanced(TreeNode root) {
    return getHeightAndCheckBalance(root) == -1 ? false : true;
  }
  
  public static int getHeightAndCheckBalance(TreeNode root) {
    if (root == null)
      return 0;
    int left = getHeightAndCheckBalance(root.left);
    int right = getHeightAndCheckBalance(root.right);
    if (left == -1 || right == -1 || Math.abs(left - right) > 1)
      return -1;
    return 1 + Math.max(left, right);
  }
}
