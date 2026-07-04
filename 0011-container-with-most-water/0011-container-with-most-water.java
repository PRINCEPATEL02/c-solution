class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length-1;
        int area = 0;
        while(left<right){
            int w = right - left;
            int a = Math.min(height[left] , height[right]) * w;
            area = Math.max(area , a);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;



    }
}