class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] f = new int[101];
        int sum = 0;
        for(int num : nums){
            f[num]++;
        }
        for(int i=0;i<101;i++){
            if(f[i] % k == 0){
                sum+= f[i]*i;
            }
        }
        return sum;
    }
}