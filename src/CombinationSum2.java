import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

  public static void main(String[] args) {
    int[] candidates = new int[] { 2, 3, 6, 7 };
    int target = 7;
    List<List<Integer>> results = combinationSum(candidates, target);
    for (List<Integer> result : results) {
      for (Integer i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    candidates = new int[] { 10, 1, 2, 7, 6, 1, 5, 1 };
    target = 8;
    results = combinationSum(candidates, target);
    for (List<Integer> result : results) {
      for (Integer i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(0, 0, new ArrayList<Integer>(), results, candidates, target);
    return results;
  }

  public static void dfs(int start, int sum, ArrayList<Integer> result, List<List<Integer>> results,
      int[] candidates, int target) {
    if (sum == target) {
      List<Integer> temp = new ArrayList<Integer>();
      temp.addAll(result);
      results.add(temp);
      return;
    }
    if (sum > target) {
      return;
    }
    for (int i = start; i < candidates.length; i++) {
      if (i != start && candidates[i] == candidates[i - 1]) {
        continue;
      }
      sum += candidates[i];
      result.add(candidates[i]);
      dfs(i + 1, sum, result, results, candidates, target);
      sum -= candidates[i];
      result.remove(result.size() - 1);
    }
  }

}
