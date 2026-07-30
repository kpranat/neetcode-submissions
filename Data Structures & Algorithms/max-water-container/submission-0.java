class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int l =0,r=heights.length-1;
        while (l<r){
            int temp = Math.abs(Math.min(heights[l],heights[r]) * (r-l));
            maxarea = Math.max(maxarea,temp);
            if (heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }                       
        }
        return maxarea;
        
    }
}
