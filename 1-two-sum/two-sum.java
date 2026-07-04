class Solution {
    public int[] twoSum(int[] nums, int target) {
      
      int ans[]=new int[2];//new array is crated.
      for(int i=0;i<nums.length-1;i++)
      {                                   // transversing the array /
         for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target) //  checking the condition , 
            {
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
         }
      }
      return ans;
    }
}

//time complexity is O(n**2)
