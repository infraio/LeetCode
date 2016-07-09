
public class SingleNumber {

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4, 4, 3, 1 };
    System.out.println(singleNumber(nums));
  }

  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }
    return result;
  }

}
