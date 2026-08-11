class Solution {
public:
    int maxProfit(vector<int>& prices) {
         /* BRUTE FORCE 
         int mx = 0;
        for(int i = 0; i < prices.size(); i++){
          for(int j = i+1; j < prices.size(); j++){
            int profit = prices[j] - prices[i];
            mx = max(max,profit);
          }
        }
        return mx; */
        // OPTIMAL SOLUTION
        int minprice=INT_MAX;
        int mx=0;
        for(int price : prices){
          if(price < minprice){
            minprice = price;
          }else{
            mx=max(mx,price - minprice);
          }
        }
        return mx;
    }
};