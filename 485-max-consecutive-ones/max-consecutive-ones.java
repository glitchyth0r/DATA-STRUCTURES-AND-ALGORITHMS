class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n=nums.length;
     int count=0;
     int max=0;

     for(int var=0;var<n;var++){
      if(nums[var]!=0){
        count++;
        max=Math.max(max,count);
      }else{
        count=0;
      }
     }   
     return max;
    }
}