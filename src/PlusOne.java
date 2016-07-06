import java.util.ArrayList;
import java.util.List;

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = new int[] {1, 9, 9, 9};
    int[] result = plusOne(digits);
    printArray(result);
    
    digits = new int[] {1, 0, 0, 0, 0};
    result = plusOne(digits);
    printArray(result);
  }

  public static int[] plusOne(int[] digits) {
    if (digits == null || digits.length == 0) {
      return digits;
    }

    List<Integer> result = new ArrayList<Integer>();
    
    int more = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      int sum = digits[i] + more;
      result.add(sum % 10);
      more = sum / 10;
    }
    if (more != 0) {
      result.add(more);
    }
    
    int[] resultArray = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArray[i] = result.get(result.size() - 1 - i);
    }
    return resultArray;
  }
  
  public static void printArray(int[] result) {
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
    System.out.println();
  }
}
