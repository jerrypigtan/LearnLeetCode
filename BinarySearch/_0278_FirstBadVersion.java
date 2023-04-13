package Test;

public class _0278_FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while(right > left)
        {
            int mid = left + (right - left) / 2;
            int currentVersion = mid;
            
            if(isBadVersion(currentVersion))
            {
            	right = mid;
            }
            else
            {
            	// because mid+1 to extend the search range.
            	left = mid + 1; 
            }
        }
        return left;
	}
	
	private static boolean isBadVersion(int currentVersion) {
	
		return false;
	}

}
