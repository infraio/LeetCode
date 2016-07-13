
public class FindPeakElement {

  public static void main(String[] args) {
    int[] nums = new int[] { 1 };
    System.out.println(findPeakElementOn(nums));
    System.out.println(findPeakElementOlogn(nums));

    nums = new int[] { 1, 2, 3 };
    System.out.println(findPeakElementOn(nums));
    System.out.println(findPeakElementOlogn(nums));

    nums = new int[] { 1, 2, 3, 1 };
    System.out.println(findPeakElementOn(nums));
    System.out.println(findPeakElementOlogn(nums));
  }

  public static int findPeakElementOn(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
        return i - 1;
      }
    }
    return nums.length - 1;
  }

  public static int findPeakElementOlogn(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    
    while (left <= right) {
      if (left == right) {
        break;
      }
      int mid = (left + right) / 2;
      if (nums[mid] < nums[mid + 1]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    
    return left;
  }
}
