class Solution {
    public int[] rearrangeArray(int[] nums) {
      int[] positive=new int[nums.length/2];
      int[] negative=new int[nums.length/2];
      int p=0;int n=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
          positive[p++]=nums[i];
        }else{
          negative[n++]=nums[i];
        }
      }
      int[] ans=new int[nums.length];
      for(int i=0;i<nums.length;i+=2){
        ans[i]=positive[i/2];
        ans[i+1]=negative[i/2];
      }
      return ans;
    }
}