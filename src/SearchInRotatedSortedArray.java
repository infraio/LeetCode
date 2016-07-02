
public class SearchInRotatedSortedArray {

  public static void main(String[] args) {
    int[] nums = new int[] {5, 6, 7, 8, 1, 2, 3, 4};
    System.out.println(search(nums, 0));
    System.out.println(search(nums, 1));
    System.out.println(search(nums, 2));
    System.out.println(search(nums, 3));
    System.out.println(search(nums, 4));
    System.out.println(search(nums, 5));
    System.out.println(search(nums, 6));
    System.out.println(search(nums, 7));
    System.out.println(search(nums, 8));
    System.out.println(search(nums, 9));
  }
  
  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (target == nums[mid]) {
        return mid;
      }
      if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }

}
