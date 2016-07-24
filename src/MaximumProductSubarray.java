
public class MaximumProductSubarray {

  public static void main(String[] args) {
    int[] nums = new int[] {2, 3, -2, 4};
    System.out.println(maxProduct(nums));
  }

  public static int maxProduct(int[] nums) {
    int localMin = 1;
    int localMax = 1;
    int globalMax = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {
      int temp = localMin;
      localMin = Math.min(nums[i], Math.min(localMin * nums[i], localMax * nums[i]));
      localMax = Math.max(nums[i], Math.max(temp * nums[i], localMax * nums[i]));
      globalMax = Math.max(localMax, globalMax);
    }
    
    return globalMax;
  }
}
