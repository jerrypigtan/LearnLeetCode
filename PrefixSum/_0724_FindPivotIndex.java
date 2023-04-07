package Test;

public class _0724_FindPivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int pivotIndex(int[] nums) {
	        int sum = 0;
	        int ans = -1;
	
	        for(int i = 0; i< nums.length; i++){
	            sum += nums[i];
	        }
	
	        int leftSum = 0;
	        for(int i = 0; i< nums.length; i++){
	             if(sum - leftSum ==  nums[i]){
	                 ans = i;
	                 break;
	             }
	
	             sum -= nums[i];
	             leftSum += nums[i];
	        }
	
	         return ans;
	 }
}
