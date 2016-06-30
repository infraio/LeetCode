
public class ImplementStrStr {

  public static void main(String[] args) {
    System.out.println(strStr("hello world", "hello"));
    System.out.println(strStr("hello world", "world"));
    System.out.println(strStr("", ""));
  }

  public static int strStr(String haystack, String needle) {
    if (haystack == null || needle == null) {
      return -1;
    }
    if (needle.length() == 0) {
      return 0;
    }
    return kmp(haystack, needle);
  }

  public static int kmp(String haystack, String needle) {
    int m = haystack.length();
    int n = needle.length();
    if (m < n) {
      return -1;
    }
    int[] next = new int[n + 1];
    getNext(needle, next);
    for (int i = 0, j = 0; i < m; i++) {
      while (j >= 0 && haystack.charAt(i) != needle.charAt(j)) {
        j = next[j];
      }
      if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
        j++;
      }
      if (j == n) {
        return i + 1 - n;
      }
    }
    return -1;
  }

  public static void getNext(String needle, int next[]) {
    next[0] = -1;
    next[1] = 0;
    for (int i = 1, j = 0; i < needle.length(); i++) {
      while (j >= 0 && needle.charAt(i) != needle.charAt(j)) {
        j = next[j];
      }
      j++;
      next[i + 1] = j;
    }
  }
}
