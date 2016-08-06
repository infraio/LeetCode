
public class LengthOfLastWord {

  public static void main(String[] args) {
    String s = "hello world";
    System.out.println(lengthOfLastWord(s));
    s = "a ";
    System.out.println(lengthOfLastWord(s));
  }

  public static int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    
    int start = -1, end = -1;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (end == -1 && s.charAt(i) != ' ') {
        end = i;
        continue;
      }
      if (end != - 1 && s.charAt(i) == ' ') {
        start = i;
        break;
      }
    }
    
    return end - start;
  }

}
