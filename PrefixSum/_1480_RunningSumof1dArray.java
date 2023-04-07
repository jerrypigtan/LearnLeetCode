package Test;

public class _1480_RunningSumof1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	//Time complexity: O(n)O(n)O(n) where nnn is the length of input array.
	//Space complexity: O(1)O(1)O(1) since we don't use any additional space to find the running sum. Note that we do not take into consideration the space occupied by the output array.
    public static int[] runningSum(int[] nums) {
        
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }
}
