import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  public static void main(String[] args) {
    int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    printResult(spiralOrder(matrix));

    matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    printResult(spiralOrder(matrix));

    matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    printResult(spiralOrder(matrix));

    matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
    printResult(spiralOrder(matrix));

    matrix = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };
    printResult(spiralOrder(matrix));

    matrix = new int[][] { { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 }, { 7 }, { 8 }, { 9 } };
    printResult(spiralOrder(matrix));
  }

  public static void printResult(List<Integer> result) {
    for (int r : result) {
      System.out.print(r + " ");
    }
    System.out.println();
  }

  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int m = matrix.length;
    if (m == 0) {
      return result;
    }
    int n = matrix[0].length;
    if (n == 0) {
      return result;
    }

    int k;
    for (k = 0; k < m / 2 && k < n / 2; k++) {
      int i, j;

      for (i = k, j = k; j < (n - k - 1); j++) {
        result.add(matrix[i][j]);
      }
      for (; i < (m - k - 1); i++) {
        result.add(matrix[i][j]);
      }
      for (; j > k; j--) {
        result.add(matrix[i][j]);
      }
      for (; i > k; i--) {
        result.add(matrix[i][j]);
      }
    }

    if (m <= n && m % 2 == 1) {
      for (int i = k, j = k; j <= n - k - 1; j++) {
        result.add(matrix[i][j]);
      }
    }

    if (m > n && n % 2 == 1) {
      for (int i = k, j = k; i <= m - k - 1; i++) {
        result.add(matrix[i][j]);
      }
    }

    return result;
  }

}
