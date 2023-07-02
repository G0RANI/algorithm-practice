import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int leftPoint = 0;
        int rightPoint = height.length - 1;
        int heightPoint = 0;
        int area = 0;
        while(rightPoint - leftPoint > 0) {
            heightPoint = Math.min(height[leftPoint], height[rightPoint]);
            area = Math.max(heightPoint * (rightPoint - leftPoint), area);
            
            if(height[leftPoint] < height[rightPoint]){ 
                leftPoint++;
            }else {
                rightPoint--;
            }
            
        }
        
        return area;
    }
}