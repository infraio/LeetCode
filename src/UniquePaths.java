
public class UniquePaths {

  public static void main(String[] args) {
    System.out.println(uniquePaths(5, 5));
    System.out.println(uniquePaths(10, 10));
  }

  public static int uniquePaths(int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }
    
    int[][] result = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0) {
          result[i][j] = 1;
        } else {
          result[i][j] = result[i - 1][j] + result[i][j - 1];
        }
      }
    }
    return result[m - 1][n - 1];
  }
}
