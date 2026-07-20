class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int countOfZeroes=0;
        int maxCount=0;

        for(int right=0;right<nums.length;right++){
          if(nums[right]==0){
            countOfZeroes++;
          }
          while(countOfZeroes > 1){
            if(nums[left]==0){
               countOfZeroes--;
            }
            left++;
          }
          int difference=right-left;
          maxCount=Math.max(maxCount,difference);
        }
        return maxCount;
    }
}