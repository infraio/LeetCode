
public class BestTimeToBuyAndSellStock2 {

  public static void main(String[] args) {
    int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));

    prices = new int[] { 7, 6, 4, 3, 1 };
    System.out.println(maxProfit(prices));
  }
  
  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int last = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > last) {
        maxProfit += prices[i] - last;
      }
      last = prices[i];
    }

    return maxProfit;
  }

}
