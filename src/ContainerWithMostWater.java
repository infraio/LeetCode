
public class ContainerWithMostWater {

  public static void main(String[] args) {
    int[] height = new int[] {};
    System.out.println(maxArea(height));
    height = new int[] { 0 };
    System.out.println(maxArea(height));
    height = new int[] { 0, 0, 0, 0 };
    System.out.println(maxArea(height));
    height = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(maxArea(height));
    height = new int[] { 5, 4, 3, 2, 3, 4, 5 };
    System.out.println(maxArea(height));
    height = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
    System.out.println(maxArea(height));
    height = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1 };
    System.out.println(maxArea(height));
  }

  public static int maxArea(int[] height) {
    int start = 0;
    int end = height.length - 1;
    int maxResult = 0;
    while (start < end) {
      int result = (end - start) * Math.min(height[start], height[end]);
      if (result > maxResult) {
        maxResult = result;
      }
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }
    return maxResult;
  }
}
