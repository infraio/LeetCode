import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    left.left = new TreeNode(4);
    right.right = new TreeNode(5);
    root.left = left;
    root.right = right;

    List<Integer> result = inorderTraversal(root);
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    result.addAll(inorderTraversal(root.left));
    result.add(root.val);
    result.addAll(inorderTraversal(root.right));
    return result;
  }
}
