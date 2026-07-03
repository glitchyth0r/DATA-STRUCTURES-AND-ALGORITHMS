class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n=numbers.length;
       int left=0;                                      // 2,7,11,15
       int right=n-1;                                   // |       |
                                                        // l=0     r=n-1
      
       while(left<right){
        if(numbers[left]+numbers[right]==target)
        {
            return new int[]{left+1,right+1};

        }
        else if((numbers[left]+numbers[right])<target)
        {
            left++;
        }
        else{
            right--;
        }
        
    }
    return new int[0];
}
}