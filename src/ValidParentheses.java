import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid(""));
    System.out.println(isValid("sadfas"));
    System.out.println(isValid("(([[]]"));
    System.out.println(isValid("(()))"));
    System.out.println(isValid("((]]"));
    System.out.println(isValid("([)]"));
    System.out.println(isValid("()"));
    System.out.println(isValid("[]"));
    System.out.println(isValid("{}"));
    System.out.println(isValid("(([[{]])})"));
    System.out.println(isValid("()[]{{}}"));
  }

  public static boolean isValid(String s) {
    if (s == null || s.length() == 0) {
      return false;
    }
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
      case '(':
        stack.push(0);
        break;
      case ')':
        if (stack.isEmpty() || stack.pop() != 0) {
          return false;
        }
        break;
      case '[':
        stack.push(1);
        break;
      case ']':
        if (stack.isEmpty() || stack.pop() != 1) {
          return false;
        }
        break;
      case '{':
        stack.push(2);
        break;
      case '}':
        if (stack.isEmpty() || stack.pop() != 2) {
          return false;
        }
        break;
      default:
        return false;
      }
    }
    return stack.isEmpty();
  }
}
