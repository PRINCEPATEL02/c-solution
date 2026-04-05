class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] x = Arrays.copyOf(arr, n);
        Arrays.sort(x);
        HashMap<Integer , Integer> map = new HashMap<>();
        int rank = 1;
        for(int num : x){
            if(!map.containsKey(num)){
                map.put(num , rank++);
            }
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}