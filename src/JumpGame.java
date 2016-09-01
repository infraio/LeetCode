import java.util.Arrays;

public class JumpGame {

  public static void main(String[] args) {
    int[] nums = new int[] { 2, 3, 1, 1, 4 };
    System.out.println(canJump(nums));
    nums = new int[] { 3, 2, 1, 0, 4 };
    System.out.println(canJump(nums));
    nums = new int[] {0, 2, 3};
    System.out.println(canJump(nums));
  }

  public static boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    if (nums.length == 1) {
      return true;
    }

    int maxJump = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (i <= maxJump) {
        maxJump = Math.max(maxJump, i + nums[i]);
      } else {
        return false;
      }
    }
    
    return maxJump >= (nums.length - 1);
  }
}
