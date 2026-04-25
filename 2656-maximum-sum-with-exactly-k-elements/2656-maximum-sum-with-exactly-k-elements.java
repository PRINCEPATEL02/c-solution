class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int a = nums[nums.length - 1];
        while(k!=0){
            ans += a;
            k--;
            a += 1;
        }
        return ans;
    }
}