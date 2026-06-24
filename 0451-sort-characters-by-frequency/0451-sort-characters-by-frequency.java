class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder ans = new StringBuilder();
        while(ans.length() < s.length()){
            int max = 0;
            char charmax = 0;
            for(int i=0;i<128;i++){
                if(freq[i] > max){
                    max = freq[i];
                    charmax = (char)i;
                }
            }
            while(max > 0){
                ans.append(charmax);
                max--;
            }
            freq[charmax] = 0;
        }
        return ans.toString();
    }
}