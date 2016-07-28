
public class PowerOfTwo {

  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(1));
    System.out.println(isPowerOfTwo(2));
    System.out.println(isPowerOfTwo(4));
    System.out.println(isPowerOfTwo(8));
    System.out.println(isPowerOfTwo(16));
    
    System.out.println(isPowerOfTwo(3));
    System.out.println(isPowerOfTwo(7));
    System.out.println(isPowerOfTwo(9));
    System.out.println(isPowerOfTwo(15));
    System.out.println(isPowerOfTwo(18));
  }
  
  public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    return (n & (n - 1)) == 0;
  }

}
