
public class NextPermutation {

  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 3, 4, 7, 6, 5};
    nextPermutation(nums);
    for (int num : nums) {
      System.out.print(num + "\t");
    }
    System.out.println();
  }

  public static void nextPermutation(int[] nums) {
    int n = nums.length;
    if (n <= 1)
        return;
    int i, ii, j;
    for (ii = n - 1, i = n - 2; i >= 0 && nums[i] >= nums[ii]; ii--, i--)
        ;
    if (i == -1) { 
        reverseArray(nums);
        return;
    }
    for (j = n - 1; j > i && nums[i] >= nums[j]; j--)
        ;
    swap(nums, i, j);
    for (i = ii, j = n - 1; i < j; i++, j--) {
        swap(nums, i, j);
    }
  }
  
  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swap(array, i, array.length - i - 1);
    }
  }
  
  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
