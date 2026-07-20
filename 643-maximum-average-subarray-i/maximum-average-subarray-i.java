class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        int maxvalue=Integer.MIN_VALUE;

        for(int right=0;right<nums.length;right++){
          sum=sum+nums[right];
          if(right-left+1==k){
            maxvalue=Math.max(maxvalue,sum);
            sum=sum-nums[left];
            left++;
          }
        }
        return (double)maxvalue/k;
    }
}