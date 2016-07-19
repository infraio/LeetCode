
public class BestTimeToBuyAndSellStock3 {

  public static void main(String[] args) {
    int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));

    prices = new int[] { 7, 6, 4, 3, 1 };
    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length < 2) {
      return 0;
    }
    
    int n = prices.length;
    
    int[] preProfit = new int[n];
    int curMin = prices[0];
    for (int i = 1; i < n; i++) {
      curMin = Math.min(curMin, prices[i]);
      preProfit[i] = Math.max(preProfit[i - 1], prices[i] - curMin);
    }
    
    int[] postProfit = new int[n];
    int curMax = prices[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      postProfit[i] = Math.max(postProfit[i + 1], curMax - prices[i]);
      curMax = Math.max(curMax, prices[i]);
    }

    int maxProfit = 0;
    for (int i = 0; i < n; i++) {
      maxProfit = Math.max(maxProfit, preProfit[i] + postProfit[i]);
    }
    
    return maxProfit;
  }
}  
