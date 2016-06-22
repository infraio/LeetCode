
public class ReverseInteger {

  public static void main(String[] args) {
    int x = 321;
    System.out.println("reverse " + x + " is " + reverse(x));
    x = -321;
    System.out.println("reverse " + x + " is " + reverse(x));
    x = 90909000;
    System.out.println("reverse " + x + " is " + reverse(x));
    x = -1000000;
    System.out.println("reverse " + x + " is " + reverse(x));
    x = 1534236469;
    System.out.println("reverse " + x + " is " + reverse(x));
  }
  
  public static int reverse(int x) {
    int result = 0;
    if (x == 0) {
      return x;
    }
    
    int symbol = x > 0 ? 1 : -1;
    if (x < 0) {
      x = 0 - x;
    }
    
    while (x > 0) {
      int nextResult = result * 10 + x % 10;
      if (result != 0  && nextResult / result < 10) {
        return 0;
      }
      result = nextResult;
      x = x / 10;
    }
    
    return result * symbol;
  }
}
