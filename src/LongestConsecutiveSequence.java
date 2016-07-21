import java.util.HashMap;

public class LongestConsecutiveSequence {

  public static void main(String[] args) {
    int[] nums = new int[] { 100, 1, 200, 3, 2, 4 };
    System.out.println(longestConsecutive(nums));
  }

  public static int longestConsecutive(int[] nums) {
    if (nums == null || nums.length <= 0) {
      return 0;
    }

    int n = nums.length;
    int longest = 0;
    HashMap<Integer, Boolean> used = new HashMap<>();

    for (int i = 0; i < n; i++) {
      used.put(nums[i], false);
    }

    for (int i = 0; i < n; i++) {
      if (used.get(nums[i])) {
        continue;
      }

      used.put(nums[i], true);
      int len = 1;
      for (int k = nums[i] + 1; used.containsKey(k); k++) {
        used.put(k, true);
        len++;
      }
      for (int k = nums[i] - 1; used.containsKey(k); k--) {
        used.put(k, true);
        len++;
      }
      longest = Math.max(longest, len);
    }

    return longest;
  }

}
