import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public static void main(String[] args) {
    int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> results = threeSum(nums);
    for (List<Integer> result : results) {
      for (Integer i : result) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        break;
      }
      if (i != 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      results.addAll(twoSum(nums, 0 - nums[i], i));
    }
    return results;
  }
  
  public static List<List<Integer>> twoSum(int[] nums, int target, int start) {
    List<List<Integer>> results = new ArrayList<>();
    int i = start + 1;
    int j = nums.length - 1;
    for (;i < j;) {
      if (i > start + 1 && nums[i] == nums[i - 1]) {
        i++;
        continue;
      }
      if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
        j--;
        continue;
      }
      if (nums[i] + nums[j] < target) {
        i++;
      } else if (nums[i] + nums[j] > target) {
        j--;
      } else {
        List<Integer> result = new ArrayList<>();
        result.add(nums[start]);
        result.add(nums[i]);
        result.add(nums[j]);
        results.add(result);
        i++;
        j--;
      }
    }
    return results;
  }
}
