class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int ans = 0;

        for (int num : nums) {
            prefix += num;

            ans += map.getOrDefault(prefix - goal, 0);

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}