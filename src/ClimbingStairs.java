
public class ClimbingStairs {

  public static void main(String[] args) {
    System.out.println(climbStairs(1));
    System.out.println(climbStairs(2));
    System.out.println(climbStairs(3));
    System.out.println(climbStairs(4));
    System.out.println(climbStairs(5));
    System.out.println(climbStairs(6));
    System.out.println(climbStairs(7));
    System.out.println(climbStairs(8));
    System.out.println(climbStairs(9));
    System.out.println(climbStairs(10));
  }

  public static int climbStairs(int n) {
    if (n < 2) {
      return 1;
    }
    
    int f0 = 1;
    int f1 = 1;
    int f2 = 0;
    
    for (int i = 2; i <= n; i++) {
      f2 = f0 + f1;
      f0 = f1;
      f1 = f2;
    }
    
    return f2;
  }
}
