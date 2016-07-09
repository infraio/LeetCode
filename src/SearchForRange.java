
public class SearchForRange {

  public static void main(String[] args) {
    int[] nums = new int[] {5, 7, 7, 8, 8, 10};
    int[] result = searchRange(nums, 8);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {0};
    result = searchRange(nums, 8);
    System.out.println(result[0] + "\t" + result[1]);
    
    result = searchRange(nums, 0);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {};
    result = searchRange(nums, 8);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
    result = searchRange(nums, 0);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {5, 7, 7, 8, 8, 10};
    result = searchRange(nums, 0);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {5, 7, 7, 8, 8, 10};
    result = searchRange(nums, 12);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {5, 7, 7, 8, 8, 10};
    result = searchRange(nums, 6);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {5, 7, 7, 8, 8, 10};
    result = searchRange(nums, 5);
    System.out.println(result[0] + "\t" + result[1]);
    
    nums = new int[] {5, 7, 7, 8, 8, 10};
    result = searchRange(nums, 10);
    System.out.println(result[0] + "\t" + result[1]);
  }

  public static int[] searchRange(int[] nums, int target) {
    if (nums.length == 0) {
      return new int[]{-1, -1};
    }
    if (nums.length == 1) {
      if (nums[0] == target) {
        return new int[] {0, 0};
      } else {
        return new int[] {-1, -1};
      }
    }
    return new int[] {searchLeft(nums, target), searchRight(nums, target)};
  }
  
  /**
   * 寻找左边界，假设start < end，且每次取中间i都更靠近start
   */
  public static int searchLeft(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int i;
    while (start < end) {
      i = (start + end) / 2;
      if (nums[i] > target) {
        end = i - 1;
      } else if (nums[i] < target){
        start = i + 1;
      } else {
        end = i;
      }
    }
    if (end == -1) {
      return end;
    }
    return nums[end] == target ? end : -1;
  }
  
  /**
   * 寻找右边界，假设start < end，且每次取中间i都更靠近end
   */
  public static int searchRight(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int i;
    while (start < end) {
      i = (start + end + 1) / 2;
      if (nums[i] > target) {
        end = i - 1;
      } else if (nums[i] < target){
        start = i + 1;
      } else {
        start = i;
      }
    }
    if (start == nums.length) {
      return -1;
    }
    return nums[start] == target ? start : -1;
  }
}
