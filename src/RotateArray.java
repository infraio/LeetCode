
public class RotateArray {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();
    rotate(nums, 3);
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - k - 1);
    reverse(nums, nums.length - k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }

  public static void reverse(int[] nums, int start, int end) {
    for (; start < end; start++, end--) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
    }
  }
}
