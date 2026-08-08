class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];

        for(int i=0;i<n;i++){
          max=Math.max(max,nums[i]);
          min=Math.min(min,nums[i]);
        }
        int[] hash=new int[max-min+1];
        for(int i=0;i<n;i++){
          hash[nums[i]-min]++;
        }
        for(int i=0;i<n;i++){
          if(hash[nums[i]-min]==1){
            return nums[i];
          }
        }
        return -1;
    }
}