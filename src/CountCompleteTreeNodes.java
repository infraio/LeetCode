
public class CountCompleteTreeNodes {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    System.out.println(countNodes(root));
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    System.out.println(countNodes(root));
  }
  
  public static int countNodes(TreeNode root) {
    if (root == null) {
        return 0;
    }
    
    TreeNode leftChild = root.left;
    int leftHeight = 1;
    while (leftChild != null) {
      leftChild = leftChild.left;
      leftHeight++;
    }
    
    TreeNode rightChild = root.right;
    int rightHeight = 1;
    while (rightChild != null) {
      rightChild = rightChild.right;
      rightHeight++;
    }
    
    if (leftHeight == rightHeight) {
      return leftHeight == 1 ? 1 : (2 << leftHeight - 1) - 1;
    }
    
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}
