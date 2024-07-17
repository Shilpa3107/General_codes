class MaxArea {
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            max = Math.max(area,max);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}