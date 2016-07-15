
public class SortColors {

  public static void main(String[] args) {
    int[] nums = new int[] { 0, 1, 1, 2, 0, 1, 2, 1, 0 };
    sortColors(nums);
    printArray(nums);
    
    nums = new int[] { 1, 0};
    sortColors(nums);
    printArray(nums);
  }

  public static void sortColors(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }

    int i = 0;
    int j;
    int k = nums.length - 1;

    for (j = 0; j <= k;) {
      if (nums[j] == 0) {
        swap(nums, i, j);
        i++;
        j++;
      } else if (nums[j] == 2) {
        swap(nums, j, k);
        k--;
      } else if (nums[j] == 1) {
        j++;
      }
    }
  }

  public static void swap(int[] nums, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  
  public static void printArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
