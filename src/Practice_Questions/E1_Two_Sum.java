package Practice_Questions;

import java.util.HashMap;
import java.util.Map;

public class E1_Two_Sum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int arr[] = twoSum(nums, target);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static  int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int j=0; j<nums.length; j++){
            map.put(nums[j], j);
        }

        for(int i=0; i<nums.length; i++){
            int value = target- nums[i];
                if(map.containsKey(value) && map.get(value)!=i){
                     return new int[] { i, map.get(value) };
                }
        }
        return new int[]{};
	}
}
