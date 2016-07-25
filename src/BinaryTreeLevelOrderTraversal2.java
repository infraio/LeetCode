import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode left = new TreeNode(9);
    TreeNode right = new TreeNode(20);
    right.left = new TreeNode(15);
    right.right = new TreeNode(7);
    root.left = left;
    root.right = right;
    
    List<List<Integer>> result = levelOrderBottom(root);
    for (List<Integer> list : result) {
      for (Integer num : list) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(0, result, root);
    return result;
  }
  
  public static void dfs(int level, List<List<Integer>> result, TreeNode node) {
    if (node == null) {
      return;
    }
    if (level >= result.size()) {
      List<Integer> list = new ArrayList<Integer>();
      list.add(node.val);
      result.add(0, list);
    } else {
      result.get(result.size() - 1 - level).add(node.val);
    }
    dfs(level + 1, result, node.left);
    dfs(level + 1, result, node.right);
  }
}
