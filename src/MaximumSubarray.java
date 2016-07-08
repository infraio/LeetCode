
public class MaximumSubarray {

  public static void main(String[] args) {
    int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSubArray(nums));
  }

  public static int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int maxResult = nums[0];
    int maxEndingHere = nums[0];
    for (int i = 1; i < nums.length; i++) {
      maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
      maxResult = Math.max(maxResult, maxEndingHere);
    }

    return maxResult;
  }

}
