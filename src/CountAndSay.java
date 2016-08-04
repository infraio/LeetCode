
public class CountAndSay {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(countAndSay(i));
    }
  }

  public static String countAndSay(int n) {
    String last = "1";
    for (int i = 1; i < n; i++) {
      String next = "";
      int len = 0;
      for (int j = 0; j < last.length(); j++) {
        if (j != 0 && last.charAt(j) != last.charAt(j - 1)) {
          next += String.valueOf(len) + last.charAt(j - 1);
          len = 0;
        }
        len++;
      }
      next += String.valueOf(len) + last.charAt(last.length() - 1);
      last = next;
    }
    return last;
  }
}
