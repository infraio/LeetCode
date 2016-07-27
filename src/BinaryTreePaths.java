import java.util.ArrayList;
import java.util.List;

public final class BinaryTreePaths {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    
    left.right = new TreeNode(5);
    root.left = left;
    root.right = right;
    
    List<String> results = binaryTreePaths(root);
    for (String result : results) {
      System.out.println(result);
    }
  }

  public static List<String> binaryTreePaths(TreeNode root) {
    List<String> results = new ArrayList<>();
    if (root == null) {
      return results;
    }
    dfs(root, new String(), results);
    return results;
  }
  
  public static void dfs(TreeNode root, String path, List<String> results) {
    if (root.left == null && root.right == null) {
      String result = new String(path);
      result += "->" + root.val;
      results.add(result.substring(2));
    } else if (root.left == null) {
      String newPath = new String(path);
      newPath += "->" + root.val;
      dfs(root.right, newPath, results);
    } else  if (root.right == null) {
      String newPath = new String(path);
      newPath += "->" + root.val;
      dfs(root.left, newPath, results);
    } else {
      String newPath = new String(path);
      newPath += "->" + root.val;
      dfs(root.left, newPath, results);
      dfs(root.right, newPath, results);
    }
  }
  
}