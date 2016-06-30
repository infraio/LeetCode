import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 1, 1, 1 };
    List<List<Integer>> results = permuteUnique(nums);
    for (List<Integer> result : results) {
      for (Integer num : result) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
    
    System.out.println();
    
    nums = new int[] { 1, 2, 1, 2 };
    results = permuteUnique(nums);
    for (List<Integer> result : results) {
      for (Integer num : result) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    boolean[] used = new boolean[nums.length];
    dfs(results, new ArrayList<Integer>(), nums, used);
    return results;
  }

  public static void dfs(List<List<Integer>> results, List<Integer> result, int[] nums,
      boolean[] used) {
    if (result.size() == nums.length) {
      results.add(result);
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!used[i]) {
        if (i != 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
          continue;
        }
        used[i] = true;
        List<Integer> newResult = new ArrayList<Integer>();
        newResult.addAll(result);
        newResult.add(nums[i]);
        dfs(results, newResult, nums, used);
        used[i] = false;
      }
    }
  }

}
