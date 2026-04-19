class Solution {
    public int[] sortByBits(int[] arr) {
        final int nm = 10001;
        for(int i=0;i<arr.length;i++){
            arr[i] += Integer.bitCount(arr[i]) * nm;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i] %= nm;
        }
        return arr;
    }
}