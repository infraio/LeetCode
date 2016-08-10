import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

  public static void main(String[] args) {
    List<Integer> result = getRow(1);
    for (Integer i : result) {
      System.out.print(i + "\t");
    }
    System.out.println();
    
    result = getRow(0);
    for (Integer i : result) {
      System.out.print(i + "\t");
    }
    System.out.println();
    
    result = getRow(3);
    for (Integer i : result) {
      System.out.print(i + "\t");
    }
    System.out.println();
  }

  public static List<Integer> getRow(int rowIndex) {
    if (rowIndex < 0) {
      return null;
    }

    List<List<Integer>> result = new ArrayList<>();
    
    for (int i = 0; i <= rowIndex; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }
      }
      result.add(row);
    }
    
    return result.get(rowIndex);
  }
}
