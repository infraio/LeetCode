
public class FindMinimumInRotatedSortedArray {

  public static void main(String[] args) {
    int[] nums = new int[] { 4, 5, 6, 7, 1, 2, 3 };
    System.out.println(findMin(nums));
  }

  public static int findMin(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;
    int min = nums[0];

    while (nums[left] > nums[right]) {
      int mid = (left + right) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return nums[left];
  }

}
