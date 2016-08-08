
public class MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = new int[] { 1, 2, 3, 4, 5 };
    int[] nums2 = new int[] { 1, 3 };
    merge(nums1, 3, nums2, 2);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }

    nums1 = new int[] { 2, 0 };
    nums2 = new int[] { 1 };
    merge(nums1, 1, nums2, 1);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1, j = n - 1, k = m + n - 1;
    for (; i >= 0 && j >= 0 && k >= 0; k--) {
      if (nums1[i] >= nums2[j]) {
        nums1[k] = nums1[i];
        i--;
      } else {
        nums1[k] = nums2[j];
        j--;
      }
    }

    if (i == -1 && j != -1) {
      for (; j >= 0; j--) {
        nums1[j] = nums2[j];
      }
    }
  }
}
