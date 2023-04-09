package Test;

import java.util.HashMap;
import java.util.Map;

public class _0001_TwoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	
	    for(int i = 0; i < nums.length; i++){
	        int currentVal = nums[i];
	        int complement = target - currentVal;
	
	        if(map.containsKey(complement)){
	            return new int[] {map.get(complement), i};
	        }
	        else{
	            // next number will find the key
		                map.put(currentVal, i);
		        }
		 }
	
		 return null;
}
}
