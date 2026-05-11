class Solution {
    public int reductionOperations(int[] nums) {
        int r = 0 , s = nums.length;
        Arrays.sort(nums);
        for(int j=s-1;j>0;--j){
            if(nums[j-1] != nums[j]){
                r += s-j;
            }
        }
        return r;

    }
}