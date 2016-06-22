
public class PalindromeNumber {

  public static void main(String[] args) {
    int x = 100101001;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = 999010999;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = 10101011;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = -2147483647;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = -2147483648;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = 2147483647;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = 10;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = 1000000001;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
    x = -101;
    System.out.println(x + " is palindrome ? " + isPalindrome(x));
  }

  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }

    int start = 0;
    int times = 1;
    for (int i = x; i >= 10; i/=10, times *= 10);
    int end = 0;

    while (times != 0 && times != 1) {
      start = (x / times) % 10;
      end = x % 10;
      System.out.println("start : " + start + ", end : " + end 
        + ", x : " + x + ", times : " + times);
      if (start != end) {
        return false;
      }
      times /= 100;
      x /= 10;
    }

    return true;
  }

}
