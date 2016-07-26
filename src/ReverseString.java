
public class ReverseString {

  public static void main(String[] args) {
    String s = "hello";
    String str = reverseString(s);
    System.out.println(str);
  }

  public static String reverseString(String s) {
    StringBuilder str = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      str.append(s.charAt(i));
    }
    return str.toString();
  }
}
