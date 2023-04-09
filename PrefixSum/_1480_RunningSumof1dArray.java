package Test;

public class _1480_RunningSumof1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        //Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
	}
	
	//Time complexity: O(n) where n is the length of input array.
	//Space complexity: O(1) since we don't use any additional space to find the running sum. Note that we do not take into consideration the space occupied by the output array.
    public static int[] runningSum(int[] nums) {
        
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }
}
