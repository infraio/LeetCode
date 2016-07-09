
public class SingleNumber2 {

  public static void main(String[] args) {
    int[] nums = new int[] {1, 1, 1, 2, 3, 3, 3, 4, 4};
    System.out.println(singleNumber2(nums));
  }
  
  public static int singleNumber2(int[] nums) {
    int ones = 0, twos = 0, threes = 0;
    int i;
    for (i = 0; i < nums.length; i++) {
      twos |= ones & nums[i];
      ones = ones ^ nums[i];
      threes = ones & twos;
      ones = ones & ~threes;
      twos = twos & ~threes;
    }
    return ones;
  }

}
