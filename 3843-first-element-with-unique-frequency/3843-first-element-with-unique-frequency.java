class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0) + 1);
        }
        
        HashMap<Integer , Integer> mapcount = new HashMap<>();
        for(int m : map.values()){
            mapcount.put(m , mapcount.getOrDefault(m , 0)+1);
        }
        for(int num : nums){
            if(mapcount.get(map.get(num)) == 1){
                return num;
            }
        }
        return -1;
    }
}