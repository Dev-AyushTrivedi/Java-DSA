/*
 * You are given an array price where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day to sell that stock. Return the maximum profit you can achieve from this tram=nsaction. if you cannnot achieve any profit return[0].
 */



public class BuySellStocks {
    public static int Stocks(int prices[]) { 
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4};
        System.out.println(Stocks(prices));
    }
}
 // time complexity = O(n)