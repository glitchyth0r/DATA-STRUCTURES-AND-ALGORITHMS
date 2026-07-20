class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int left=0;
       int already_satisfied=0;
       int extras=0;
       int max_satisfied=0;

       for(int right=0;right<customers.length;right++){
        if(grumpy[right]==0){
          already_satisfied=already_satisfied+customers[right];
        }
        else{
          extras=extras+customers[right];
        }
        if(right-left+1==minutes){
          max_satisfied=Math.max(max_satisfied,extras);
          if(grumpy[left]==1){
            extras-=customers[left];
          }
          left++;
        }
       }
       return already_satisfied+max_satisfied; 
    }
}