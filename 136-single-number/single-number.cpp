class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n=nums.size();
        int mx=nums[0];
        int mi=nums[0];
        for(int i=0;i<n;i++){
            mx=max(mx,nums[i]);
            mi=min(mi,nums[i]);
        }
        vector<int> hash(mx-mi+1);
        for(int i=0;i<n;i++){
            hash[nums[i]-mi]++;
        }
        for(int i=0;i<n;i++){
            if(hash[nums[i]-mi]==1){
                return nums[i];
            }
        }
        return -1;
    }
};