
public class SearchInsertPosition {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 5, 7, 10 };
    System.out.println(searchInsert(nums, 0));
    System.out.println(searchInsert(nums, 1));
    System.out.println(searchInsert(nums, 4));
    System.out.println(searchInsert(nums, 10));
    System.out.println(searchInsert(nums, 11));

    nums = new int[] { 1 };
    System.out.println(searchInsert(nums, 0));
    System.out.println(searchInsert(nums, 1));
    System.out.println(searchInsert(nums, 2));
  }

  public static int searchInsert(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int start = 0;
    int end = nums.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }
}
