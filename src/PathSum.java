
public class PathSum {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    TreeNode left = new TreeNode(4);
    TreeNode right = new TreeNode(8);
    TreeNode leftChild = new TreeNode(11);
    TreeNode rightChild = new TreeNode(4);
    
    leftChild.left = new TreeNode(7);
    leftChild.right = new TreeNode(2);
    rightChild.right = new TreeNode(1);
    
    left.left = leftChild;
    right.left = new TreeNode(13);
    right.right = rightChild;
    
    root.left = left;
    root.right = right;
    
    System.out.println(hasPathSum(root, 22));
    System.out.println(hasPathSum(root, 20));
    
    root = new TreeNode(1);
    root.left = new TreeNode(2);
    System.out.println(hasPathSum(root, 1));
    System.out.println(hasPathSum(root, 3));
  }

  public static boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    return dfs(root, sum);
  }

  public static boolean dfs(TreeNode root, int sum) {
    if (root.left == null && root.right == null) {
      return root.val == sum;
    } else if (root.left == null) {
      return dfs(root.right, sum - root.val);
    } else if (root.right == null) {
      return dfs(root.left, sum - root.val);
    } else {
      return dfs(root.right, sum - root.val) || dfs(root.left, sum - root.val);
    }
  }
}
