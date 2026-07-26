class Solution {
    public int maxArea(int[] height) {
        int n=height.length,left=0,right=n-1,max=Integer.MIN_VALUE,width;
        while(left<right){
            width=right-left;
            max=Math.max(max,width*Math.min(height[right],height[left]));

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}