import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3 };
    List<List<Integer>> results = permute(nums);
    for (List<Integer> result : results) {
      for (Integer num : result) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    dfs(results, new ArrayList<Integer>(), nums, nums.length);
    return results;
  }

  public static void dfs(List<List<Integer>> results, List<Integer> result, int[] nums, int n) {
    if (n == 0) {
      results.add(result);
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      boolean need = true;
      for (Integer num : result) {
        if (num == nums[i]) {
          need = false;
        }
      }
      if (need) {
        List<Integer> newResult = new ArrayList<Integer>();
        newResult.addAll(result);
        newResult.add(nums[i]);
        dfs(results, newResult, nums, n - 1);
      }
    }
  }

}
