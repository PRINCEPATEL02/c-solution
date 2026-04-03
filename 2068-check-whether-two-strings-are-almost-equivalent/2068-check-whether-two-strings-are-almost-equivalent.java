class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] c = new int[26];
        for( char ch : word1.toCharArray()){
            c[ch-'a']++;
        }
        for(char ch : word2.toCharArray()){
            c[ch-'a']--;
        }
        for(int d : c){
            if(d>3 || d<-3){
                return false;
            }
        }
        return true;
    }
}