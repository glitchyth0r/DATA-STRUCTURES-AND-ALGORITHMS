class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> positive(nums.size()/2);
        vector<int> negative(nums.size()/2);

        int p=0;int n=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0){
                positive[p++]=nums[i];
            }else{
                negative[n++]=nums[i];
            }
        }
        vector<int> ans(nums.size());
        for(int i=0;i<nums.size();i+=2){
            ans[i]=positive[i/2];
            ans[i+1]=negative[i/2];
        }
        return ans;
    }
};