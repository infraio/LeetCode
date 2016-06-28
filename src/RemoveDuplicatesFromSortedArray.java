
public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 9 };
    int n = removeDuplicates(nums);
    System.out.println("new length is " + n);
    printArray(nums, n);
    int[] nums1 = new int[] { 1 };
    n = removeDuplicates(nums1);
    System.out.println("new length is " + n);
    printArray(nums1, n);
    int[] nums2 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    n = removeDuplicates(nums2);
    System.out.println("new length is " + n);
    printArray(nums2, n);
    int[] nums3 = new int[] {};
    n = removeDuplicates(nums3);
    System.out.println("new length is " + n);
    printArray(nums3, n);
    int[] nums4 = new int[] { 1, 1, 2 };
    n = removeDuplicates(nums4);
    System.out.println("new length is " + n);
    printArray(nums4, n);
  }

  public static int removeDuplicates(int[] nums) {
    int n = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        nums[n] = nums[i];
        n++;
      }
    }
    return n;
  }
  
  public static void printArray(int[] nums, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + "\t");
    }
    System.out.println();
  }
}