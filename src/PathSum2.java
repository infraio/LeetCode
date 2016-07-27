import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    TreeNode left = new TreeNode(4);
    TreeNode right = new TreeNode(8);
    TreeNode leftChild = new TreeNode(11);
    TreeNode rightChild = new TreeNode(4);
    
    leftChild.left = new TreeNode(7);
    leftChild.right = new TreeNode(2);
    rightChild.left = new TreeNode(5);
    rightChild.right = new TreeNode(1);
    
    left.left = leftChild;
    right.left = new TreeNode(13);
    right.right = rightChild;
    
    root.left = left;
    root.right = right;
    
    List<List<Integer>> results = pathSum(root, 22);
    for (List<Integer> result : results) {
      for (Integer i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> results = new ArrayList<>();
    if (root == null) {
      return results;
    }
    dfs(root, sum, new ArrayList<Integer>(), results);
    return results;
  }
  
  public static void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> results) {
    path.add(root.val);
    if (root.left == null && root.right == null) {
      if (root.val == sum) {
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(path);
        results.add(result);
      }
    } else if (root.left == null) {
      dfs(root.right, sum - root.val, path, results);
    } else if (root.right == null) {
      dfs(root.left, sum - root.val, path, results);
    } else {
      dfs(root.right, sum - root.val, path, results);
      dfs(root.left, sum - root.val, path, results);
    }
    path.remove(path.size() - 1);
  }
}
