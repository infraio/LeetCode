
public class GasStation {

  public static void main(String[] args) {
    int[] gas = new int[] { 1, 1, 2, 3, 4, 5 };
    int[] cost = new int[] { 2, 2, 2, 2, 2, 2 };
    System.out.println(canCompleteCircuit(gas, cost));
  }

  public static int canCompleteCircuit(int[] gas, int[] cost) {
    int start = 0, sum = 0, total = 0;
    int n = gas.length;
    for (int i = 0; i < n; i++) {
      total += gas[i] - cost[i];
      sum += gas[i] - cost[i];
      if (sum < 0) {
        sum = 0;
        start = i + 1;
      }
    }
    return total < 0 ? -1 : start;
  }
}
