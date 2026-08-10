class Solution {
    public int maxSubArray(int[] nums) {
        /*BRUTE FORCE

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;*/

        //Kadanes Algorithm

        int n= nums.length;
        int currmx=nums[0]; int globalmx=nums[0];

        for(int i=1;i<n;i++){
          currmx=Math.max(currmx + nums[i] , nums[i]);
          globalmx=Math.max(currmx,globalmx);
        }
        return globalmx;
    }
}