class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int  c = 0;
        for(int k : nums){
            if(map.containsKey(k)){
                c += map.get(k);
                map.put(k , map.get(k)+1);
            }
            else{
                map.put(k , 1);
            }
        }
        return c;
    }
}