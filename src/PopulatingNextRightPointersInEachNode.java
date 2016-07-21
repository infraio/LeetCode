
public class PopulatingNextRightPointersInEachNode {

  public static void main(String[] args) {
    TreeLinkNode root = new TreeLinkNode(1);
    TreeLinkNode left = new TreeLinkNode(2);
    TreeLinkNode right = new TreeLinkNode(3);
    left.left = new TreeLinkNode(4);
    left.right = new TreeLinkNode(5);
    root.left = left;
    root.right = right;
   
    connect(root);
    printTreeLinkNodeNext(root);
  }

  public static void connect(TreeLinkNode root) {
    if (root == null) {
      return;
    }
    if (root.left != null) {
      root.left.next = root.right;
    }
    if (root.right != null) {
      root.right.next = root.next == null ? null : root.next.left;
    }
    connect(root.left);
    connect(root.right);
  }

  public static void printTreeLinkNodeNext(TreeLinkNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.val + ", next is ");
    if (root.next != null) {
      System.out.print(root.next.val);
    } else {
      System.out.print("null");
    }
    System.out.println();
    printTreeLinkNodeNext(root.left);
    printTreeLinkNodeNext(root.right);
  }
}
