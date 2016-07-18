
public class BestTimeToBuyAndSellStock {

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

    int min = prices[0];
    int max = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > max) {
        max = prices[i];
        maxProfit = Math.max(maxProfit, max - min);
      } else if (prices[i] < min) {
        max = prices[i];
        min = prices[i];
      }
    }

    return maxProfit;
  }

}
