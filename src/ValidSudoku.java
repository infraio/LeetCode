import java.util.Arrays;

public class ValidSudoku {

  public static void main(String[] args) {

  }

  public static boolean isValidSudoku(char[][] board) {
    boolean[] valid = new boolean[9];

    for (int i = 0; i < 9; i++) {
      Arrays.fill(valid, false);
      for (int j = 0; j < 9; j++) {
        if (!isValid(valid, board[i][j])) {
          return false;
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      Arrays.fill(valid, false);
      for (int j = 0; j < 9; j++) {
        if (!isValid(valid, board[j][i])) {
          return false;
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      Arrays.fill(valid, false);
      for (int j = 0; j < 9; j++) {
        if (!isValid(valid, board[(i / 3) * 3 + j / 3][(i % 3) * 3 + j % 3])) {
          return false;
        }
      }
    }

    return true;
  }
  
  public static boolean isValid(boolean[] valid, char c) {
    if (c == '.') {
      return true;
    }
    int num = c - '1';
    if (valid[num]) {
      return false;
    }
    valid[num] = true;
    return true;
  }
}
