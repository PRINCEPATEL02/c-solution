class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int b : bulbs){
            map.put(b , map.getOrDefault(b , 0) + 1);
        }
        List<Integer> r = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) % 2 != 0){
                r.add(key);
            }
        }
        Collections.sort(r);
        return r;
    }
}