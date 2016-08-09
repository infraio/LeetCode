import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

  public static void main(String[] args) {
    List<List<Integer>> result = generate(1);
    for (List<Integer> row : result) {
      for (Integer i : row) {
        System.out.print(i + "\t");
      }
      System.out.println();
    }
    
    result = generate(5);
    for (List<Integer> row : result) {
      for (Integer i : row) {
        System.out.print(i + "\t");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    
    for (int i = 1; i <= numRows; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          row.add(1);
        } else {
          row.add(result.get(i - 2).get(j - 2) + result.get(i - 2).get(j - 1));
        }
      }
      result.add(row);
    }
    
    return result;
  }
}
