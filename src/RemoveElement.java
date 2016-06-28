
public final class RemoveElement {

  public static void main(String[] args) {
    int[] nums = new int[] { 3, 2, 2, 2, 3, 3, 4, 5, 3 };
    int n = removeElement(nums, 3);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums, n);
    int[] nums1 = new int[] { 1 };
    n = removeElement(nums1, 0);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums1, n);
    int[] nums2 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    n = removeElement(nums2, 1);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums2, n);
    int[] nums3 = new int[] {};
    n = removeElement(nums3, 0);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums3, n);
    int[] nums4 = new int[] { 1, 1, 2 };
    n = removeElement(nums4, 2);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums4, n);
    int[] nums5 = new int[] { 1, 1, 2 };
    n = removeElement(nums5, 1);
    System.out.println("new length is " + n);
    RemoveDuplicatesFromSortedArray.printArray(nums5, n);
  }

  public static int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    int i, j;
    for (i = 0, j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        if (i != j) {
          nums[i] = nums[j];
        }
        i++;
      }
    }
    return i;
  }
}
