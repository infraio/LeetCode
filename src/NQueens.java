import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

  public static void main(String[] args) {
    List<List<String>> results = solveNQueens(4);
    for (List<String> result : results) {
      for (String s : result) {
        System.out.println(s);
      }
      System.out.println();
    }
    results = solveNQueens(8);
    System.out.println(results.size());
  }
  
  public static List<List<String>> solveNQueens(int n) {
    List<List<String>> results = new ArrayList<>();
    if (n <= 0) {
      return results;
    }
    
    int[] pos = new int[n];
    dfs(0, n, pos, results);
    return results;
  }
  
  public static void dfs(int level, int n, int[] pos, List<List<String>> results) {
    if (level == n) {
      List<String> result = new ArrayList<String>();
      for (int i = 0; i < n; i++) {
        char[] data = new char[n];
        Arrays.fill(data, '.');
        data[pos[i]] = 'Q';
        String s = new String(data);
        result.add(s);
      }
      results.add(result);
    } else {
      for (int i = 0; i < n; i++) {
        pos[level] = i;
        if (checkOk(level, pos)) {
          dfs(level + 1, n, pos, results);
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
