import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

  public static void main(String[] args) {
    List<String> result = generateParenthesis(3);
    for (String s : result) {
      System.out.println(s);
    }
  }

  public static List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    dfs(result, "", n, n);
    return result;
  }
  
  /**
   * 深度优先搜索
   * @param result
   * @param s
   * @param left 还可以向左儿子搜索几次
   * @param right 还可以向右儿子搜索几次
   */
  public static void dfs(List<String> result, String s, int left, int right) {
    // 剪枝
    if (left > right) {
      return;
    }
    
    // 到达叶子节点
    if (left == 0 && right == 0) {
      result.add(s);
      return;
    }
    
    // 向左儿子继续搜索
    if (left > 0) {
      dfs(result, s + "(", left - 1, right);
    }
    
    // 向右儿子继续搜索
    if (right > 0) {
      dfs(result, s + ")", left, right -1);
    }
  }
}