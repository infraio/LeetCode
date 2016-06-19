
public class ZigZagConversion {

  public static void main(String[] args) {
    String s = "PAYPALISHIRING";
    System.out.println(convert(s, 3));
  }
  
  public static String convert(String s, int numRows) {
    String result = "";
    if (s == null || s.length() == 0 || numRows == 1) {
      return s;
    }
    
    int cycle = 2 * numRows - 2;
    for (int i = 0; i < numRows; i++) {
      for (int j = i; j < s.length(); ) {
        result += s.charAt(j);
        if (j % cycle != 0 && j % cycle != (numRows - 1)) {
          int next = j + cycle - 2 * (j % cycle);
          if (next < s.length()) {
            result += s.charAt(next);
          }
        }
        j += cycle;
      }
    }
    
    return result;
  }

}
