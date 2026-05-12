class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            set.add(num);
            set.add(revNumber(num));
        }
        return set.size();
    }
    private int revNumber(int n){
        int revNum = 0;
        while(n > 0){
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n /= 10;
        }
        return revNum;
    }
}