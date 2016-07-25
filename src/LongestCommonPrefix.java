
public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strs = new String[] { "hello" };
    System.out.println(longestCommonPrefix(strs));

    strs = new String[] { "hello", "hero", "heavy" };
    System.out.println(longestCommonPrefix(strs));
    
    strs = new String[] {"aa", "a"};
    System.out.println(longestCommonPrefix(strs));
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length <= 0) {
      return "";
    }

    String prefix = "";
    String first = strs[0];
    for (int i = 0; i < first.length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].length() <= i || strs[j].charAt(i) != first.charAt(i)) {
          return prefix;
        }
      }
      prefix += first.charAt(i);
    }
    return prefix;
  }
}
