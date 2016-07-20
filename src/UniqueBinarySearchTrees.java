
public class UniqueBinarySearchTrees {

  public static void main(String[] args) {
    System.out.println(numTrees(1));
    System.out.println(numTrees(2));
    System.out.println(numTrees(3));
    System.out.println(numTrees(4));
    System.out.println(numTrees(5));
    System.out.println(numTrees(6));
    System.out.println(numTrees(7));
    System.out.println(numTrees(8));
    System.out.println(numTrees(9));
    System.out.println(numTrees(10));
  }

  public static int numTrees(int n) {
    if (n <= 1) {
      return 1;
    }
    
    int[] num = new int[n + 1];
    num[0] = 1;
    num[1] = 1;
    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        num[i] += num[j] * num[i - 1 - j];
      }
    }
    return num[n];
  }
}
