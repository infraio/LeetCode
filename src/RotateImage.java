
public class RotateImage {

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = i * 4 + j + 1;
      }
    }
    
    rotate(matrix);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void rotate(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return;
    }

    // swap by diagonal line
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][m - 1 - i];
        matrix[n - 1 - j][m - 1 - i] = temp;
      }
    }

    // swap by axle wire
    for (int i = 0; i < m / 2; i++) {
      for (int j = 0; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[m - 1 - i][j];
        matrix[m - 1 - i][j] = temp;
      }
    }
  }

}
