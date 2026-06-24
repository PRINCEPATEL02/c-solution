class Solution {
    public int titleToNumber(String columnTitle) {
        int r = 0;
        for(char ch : columnTitle.toCharArray()){
            int v = ch - 'A' + 1;
            r = r*26 + v;
        }
        return r;
    }
}