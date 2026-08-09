class Solution {
    public int maxSubArray(int[] nums) {
        // Kadanes Algorithm

        int n= nums.length;
        int currMax=nums[0];int globalMax=nums[0];
        for(int i=1;i<n;i++){
          currMax=Math.max(currMax+nums[i],nums[i]);
          globalMax=Math.max(globalMax,currMax);
        }
        return globalMax;
    }
}