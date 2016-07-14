import java.util.ArrayList;
import java.util.List;

public class GrayCode {

  public static void main(String[] args) {
    List<Integer> result = grayCode(0);
    printList(result);
    
    result = grayCode(1);
    printList(result);
    
    result = grayCode(2);
    printList(result);
    
    result = grayCode(3);
    printList(result);
  }

  public static List<Integer> grayCode(int n) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      if (i == 0) {
        result.add(0);
      } else {
        for (int j = result.size() - 1; j >= 0; j--) {
          result.add(result.get(j) + (int) Math.pow(2, i - 1));
        }
      }
    }
    return result;
  }
  
  public static void printList(List<Integer> result) {
    for (Integer i : result) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
