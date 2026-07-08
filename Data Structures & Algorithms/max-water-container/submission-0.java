class Solution {
    public int maxArea(int[] heights) {
        
      int n=heights.length;
      int maxarea=0;
      int l=0,r=n-1;

     while(l<r)
     {
        int area=Math.min(heights[l],heights[r])*(r-l);

        maxarea=Math.max(maxarea,area);

        if(heights[l]<heights[r])
        l++;
        else
        r--;
     }
       return maxarea;
    }
}