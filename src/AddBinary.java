
public class AddBinary {

  public static void main(String[] args) {
    String a = "11";
    String b = "1";
    System.out.println(addBinary(a, b));
    a = "";
    b = "11111";
    System.out.println(addBinary(a, b));
  }
  
  public static String addBinary(String a, String b) {
    int m = a.length();
    int n = b.length();
    int len = m > n ? m : n;
    int more = 0;
    String result = "";

    for (int i = 0; i < len; i++) {
      int ai = (m - 1 - i) >= 0 ? a.charAt(m - 1 - i) - '0' : 0;
      int bi = (n - 1 - i) >= 0 ? b.charAt(n - 1 - i) - '0' : 0;
      int sum = ai + bi + more;
      result += (sum % 2) == 0 ? "0" : "1";
      more = sum / 2;
    }
    if (more == 1) {
      result += "1";
    }

    return new StringBuffer(result).reverse().toString();
  }

}
