import java.util.ArrayList;
import java.util.List;

public class NQueens2 {

  public static void main(String[] args) {
    System.out.println(totalNQueens(4));
    System.out.println(totalNQueens(8));
  }

  public static int totalNQueens(int n) {
    if (n <= 0) {
      return 0;
    }
    
    int[] result = new int[] {0};
    int[] pos = new int[n];
    dfs(0, n, pos, result);
    return result[0];
  }

  public static void dfs(int level, int n, int[] pos, int[] result) {
    if (level == n) {
      result[0] += 1;
    } else {
      for (int i = 0; i < n; i++) {
        pos[level] = i;
        if (checkOk(level, pos)) {
          dfs(level + 1, n, pos, result);
        }
      }
    }
  }

  public static boolean checkOk(int level, int[] pos) {
    for (int i = 0; i < level; i++) {
      if (pos[i] == pos[level] || Math.abs(level - i) == Math.abs(pos[level] - pos[i])) {
        return false;
      }
    }
    return true;
  }
}
