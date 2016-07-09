import java.util.Arrays;

public class SetMatrixZeroes {

  public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    for (int i = 0; i < matrix.length; i++) {
      Arrays.fill(matrix[i], 1);
    }
    matrix[0][0] = 0;
    printMatrix(matrix);
    System.out.println();

    setZeroes(matrix);
    printMatrix(matrix);
  }

  public static void setZeroes(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return;
    }
    
    int m = matrix.length;
    int n = matrix[0].length;
    
    boolean firstRowZero = false;
    boolean firstColumnZero = false;
    for (int j = 0; j < n; j++) {
      if (matrix[0][j] == 0) {
        firstRowZero = true;
        break;
      }
    }
    for (int i = 0; i < m; i++) {
      if (matrix[i][0] == 0) {
        firstColumnZero = true;
        break;
      }
    }
    
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
    
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (firstRowZero) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }
    if (firstColumnZero) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }
  }
  
  public static void printMatrix(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    System.out.println("Matrix, " + m + " rows, " + n + " columns :");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
