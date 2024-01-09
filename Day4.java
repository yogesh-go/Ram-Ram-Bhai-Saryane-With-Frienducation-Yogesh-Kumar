// Problem 1 : Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<len;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) {
                sum = 0;
            } 
        }
        
        return max;
    }
}


// Problem 2 : Maximum Points You Can Obtain From Cards
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int st = len - k;
        int end = st;
        int sum = 0;
        int res = 0;
        for(int i = 0; i < k * 2; i++){
            sum += cardPoints[end % len];
            if(i >= k - 1){
                res = Math.max(res, sum);
                sum -= cardPoints[st % len];
                st++;
            }
            end++;
        }
        return res;
    }
}