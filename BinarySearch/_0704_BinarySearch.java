package Test;

public class _0704_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int search(int[] nums, int target) {
	        if(nums == null)
	        {
	            return -1;
	        }
	        
	        int index = -1;
	        int left = 0;
	        int right = nums.length-1;
	        
	        int midPoint =  0;
	        
	        while(right >= left)
	        {
	            // to prevent overflow
	            // let say int max is 10
	            // 2+20/2 = 11
	            // so we use 2 + (20 - 2) / 2 = 10;
	            midPoint = left + (right - left) / 2;
	            
	            int currentValue = nums[midPoint];
	            
	            if(currentValue == target)
	            {
	                index = midPoint;
	            }
	            
	            if(currentValue > target)
	            {
	                right = midPoint - 1;
	            }
	            else
	            {
	                left = midPoint + 1;
	            }
	            
	        }
	        
	        return index;
	        
	        // TC: O(log n)
	        // SC: O(1)
	    }

}
