
public class SpiralMatrix2 {

  public static void main(String[] args) {
    printMatrix(generateMatrix(1));
    printMatrix(generateMatrix(2));
    printMatrix(generateMatrix(3));
    printMatrix(generateMatrix(4));
    printMatrix(generateMatrix(5));
  }

  public static void printMatrix(int[][] nums) {
    int m = nums.length;
    if (m <= 0) {
      return;
    }
    int n = nums[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] generateMatrix(int n) {
    if (n < 0) {
      return null;
    }
    
    int[][] result = new int[n][n];
    int num = 0;
    
    int k;
    for (k = 0; k < n / 2; k++) {
      int i, j;

      for (i = k, j = k; j < (n - k - 1); j++) {
        result[i][j] = ++num;
      }
      for (; i < (n - k - 1); i++) {
        result[i][j] = ++num;
      }
      for (; j > k; j--) {
        result[i][j] = ++num;
      }
      for (; i > k; i--) {
        result[i][j] = ++num;
      }
    }
    
    if (n % 2 == 1) {
      result[k][k] = ++num;
    }
    
    return result;
  }
}
