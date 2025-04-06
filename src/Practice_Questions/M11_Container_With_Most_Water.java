package Practice_Questions;

public class M11_Container_With_Most_Water {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int result  = maxArea(height);
		System.out.println(result);
	}	

	public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, minHeight * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
