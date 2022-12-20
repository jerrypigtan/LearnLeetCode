package Test;

// question from : https://leetcode.com/problems/happy-number/description/

public class _0202_HappyNumber {

	public static void main(String[] args) 
	{
		System.out.println(isHappy(19)); // true
		System.out.println(isHappy(2)); // false
	}
	
	// Time complexity : O(log n)
	// Space complexity : O (1)
	public static boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);

        boolean isHappy = false;

        // when fastRunner is equal to 1, then no need to get next
        // when fastRunner is equal to slowRunner, then no need to get next
        while(fastRunner!= 1 && fastRunner != slowRunner)
        {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }

        if(fastRunner == 1)
        {
        	isHappy = true;
        }
        
        return isHappy;
    }

    public static int getNext(int n)
    {
        int total = 0;
        
        while(n > 0)
        {
            int remainder = n % 10;
            n = n / 10;
            total += remainder * remainder;
        }
        
        return total;
    }
}
