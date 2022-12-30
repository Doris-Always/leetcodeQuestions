package arrayQuestions;
//        You are given an array prices where prices[i] is the price of a given stock on the ith day.You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

public class MaximumProfitOnAStock {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int [] prices){
        int maxProfit = 0;
        for (int i = 0;i < prices.length - 1;i++){
            for (int j = i + 1; j < prices.length;j++){
                if (prices[i] < prices[j]){
                    int profit = prices[j] - prices[i];
                    if(profit > maxProfit) maxProfit = profit;
                }

            }
        }
        return maxProfit;
    }
}
