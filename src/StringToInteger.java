
public class StringToInteger {

  public static void main(String[] args) {
    System.out.println(myAtoi(null));
    System.out.println(myAtoi(""));
    System.out.println(myAtoi("1"));
    System.out.println(myAtoi("-1"));
    System.out.println(myAtoi("123"));
    System.out.println(myAtoi("-123"));
    System.out.println(myAtoi("   1"));
    System.out.println(myAtoi("  -1ssdd   "));
    System.out.println(myAtoi("aaa1"));
    System.out.println(myAtoi("2147483647"));
    System.out.println(myAtoi("-2147483648"));
    System.out.println(myAtoi("2147483648"));
    System.out.println(myAtoi("-2147483649"));
  }

  public static int myAtoi(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    
    int i = 0;
    while (Character.isWhitespace(str.charAt(i))) {
      i++;
    }
    
    int sign = str.charAt(i) == '-' ? -1 : 1;
    if (str.charAt(i) == '-' || str.charAt(i) == '+') {
      i++;
    }
    
    int n = 0;
    int lastn = 0;
    while (i < str.length() && Character.isDigit(str.charAt(i))) {
      lastn = n;
      n = n * 10 + Integer.valueOf(str.substring(i, i + 1));
      if (lastn != 0 && n / lastn < 10) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      i++;
    }
    
    return n * sign;
  }
}
