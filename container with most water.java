public class Solution {
    // problem: find the max area to contain most water
    public int maxArea(int[] height) {
        int maxarea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * (right - l));
            // change the boundary of the max area if the maximum value has changed
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxarea;
    }
}