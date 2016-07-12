
public class MajorityElement {

  public static void main(String[] args) {
    int[] nums = new int[] {2, 2, 3, 1, 1, 2, 1, 1};
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int majority = nums[0];
    int times = 0;

    for (int i = 0; i < nums.length; i++) {
      if (times == 0) {
        majority = nums[i];
        times += 1;
      } else {
        if (nums[i] == majority) {
          times++;
        } else {
          times--;
        }
      }
    }

    return majority;
  }
}
