
public class RemoveDuplicatesFromSortedArray2 {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5 };
    int n = removeDuplicates(nums);
    System.out.println("new length is " + n);
    printArray(nums, n);
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length <= 2) {
      return nums.length;
    }

    int n = 0;
    for (int j = 2; j < nums.length; j++) {
      if (nums[j] != nums[n]) {
        n++;
        nums[n + 1] = nums[j];
      }
    }

    return n + 2;
  }

  public static void printArray(int[] nums, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
