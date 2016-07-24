import java.util.List;

public class ConvertSortedArrayToBinarySearchTree {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    TreeNode root = sortedArrayToBST(nums);
    List<Integer> numsList = BinaryTreeInorderTraversal.inorderTraversal(root);
    for (Integer num : numsList) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length < 1) {
      return null;
    }
    return sortedArrayToBSTRecursive(nums, 0, nums.length - 1);
  }

  public static TreeNode sortedArrayToBSTRecursive(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    } else if (start == end) {
      return new TreeNode(nums[start]);
    } else {
      int mid = (start + end) / 2;
      TreeNode root = new TreeNode(nums[mid]);
      root.left = sortedArrayToBSTRecursive(nums, start, mid - 1);
      root.right = sortedArrayToBSTRecursive(nums, mid + 1, end);
      return root;
    }
  }
}
