
public class TwoSum {

  public static void main(String[] args) {
    int[] nums = new int[]{7,2,8,3};
    int[] result = twoSum(nums, 10);
    System.out.println("Result:");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
  
  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    if (nums.length <= 1) {
      return result;
    }
    
    int[] sortedIndex = sortWithIndex(nums);
    System.out.println("SortedIndex:");
    for (int i = 0; i < sortedIndex.length; i++) {
      System.out.println(sortedIndex[i] + "\t" + nums[sortedIndex[i]]);
    }
    int i = 0;
    int j = nums.length - 1;
    for (; i < j;) {
      if (nums[sortedIndex[i]] + nums[sortedIndex[j]] == target) {
        break;
      } else if (nums[sortedIndex[i]] + nums[sortedIndex[j]] < target) {
        i++;
      } else if (nums[sortedIndex[i]] + nums[sortedIndex[j]] > target) {
        j--;
      }
    }
    result[0] = sortedIndex[i];
    result[1] = sortedIndex[j];
    return result;
  }

  public static int[] sortWithIndex(int[] nums) {
    int n = nums.length;
    int[] sortedIndex = new int[n];
    for (int i = 0; i < n; i++) {
      sortedIndex[i] = i;
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        if (nums[sortedIndex[j]] > nums[sortedIndex[j + 1]]) {
          int temp = sortedIndex[j];
          sortedIndex[j] = sortedIndex[j + 1];
          sortedIndex[j + 1] = temp;
        }
      }
    }
    return sortedIndex;
  }
}
