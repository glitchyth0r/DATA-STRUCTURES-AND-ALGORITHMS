class Solution {
    public int maxProfit(int[] prices) {
        /* int max = 0;
        for(int i = 0; i < prices.length; i++){
          for(int j = i+1; j < prices.length; j++){
            int profit = prices[j] - prices[i];
            max = Math.max(max,profit);
          }
        }
        return max; */

        //Optimal solution

        int max=0;
        int minprice=Integer.MAX_VALUE;

        for(int price:prices){
          if(price<minprice){
            minprice=price;
          }else{
            max=Math.max(max,price-minprice);
          }
        }
        return max;
    }
}