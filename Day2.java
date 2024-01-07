

// Problem 1 : Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Sum2 = (n * (n + 1))/2;
        int Sum1 = 0;
        for (int i = 0;i<n;i++){
            Sum1 = Sum1 + nums[i];
        }
        return Sum2 - Sum1;
    }
}

// Problem 2 : Best time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProf = 0;

        for(int i=1;i<prices.length;i++){
            maxProf = Math.max(maxProf,prices[i]-minPrice);
            minPrice = Math.min(prices[i],minPrice);
        }

        return maxProf;
    }
}