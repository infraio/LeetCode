
public class FindMinimumInRotatedSortedArray2 {

  public static void main(String[] args) {
    int[] nums = new int[] {1, 1, 1, 1, 1, 1, 0};
    System.out.println(findMin(nums));
  }

  public static int findMin(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;
    
    while (left < right && nums[left] >= nums[right]) {
      int mid = (left + right) / 2;
      if (nums[mid] > nums[left]) {
        left = mid;
      } else if (nums[mid] < nums[left]) {
        right = mid;
      } else {
        left += 1;
      }
    }
    
    return nums[left];
  }
}
