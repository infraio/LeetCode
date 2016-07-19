
public class SameTree {

  public static void main(String[] args) {
    TreeNode tree1 = new TreeNode(5);
    TreeNode tree2 = new TreeNode(5);
    TreeNode left = new TreeNode(5);
    TreeNode right = new TreeNode(5);
    tree1.left = left;
    tree1.right = right;
    tree2.left = left;
    tree2.right = right;
    
    System.out.println(isSameTree(tree1, tree2));
  }
  
  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      return false;
    } else {
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
  }

}
