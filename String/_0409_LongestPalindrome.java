package Test;

public class _0409_LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abccccdd"));
	}

	public static int longestPalindrome(String s) {
	    int[] charCount = new int [126];
	
	    for(int i = 0; i < s.length(); i++){
	        char curChar = s.charAt(i);
	        charCount[curChar] ++;
	    }
	
	    int ans = 0;
	    for(int i =0; i < charCount.length; i++){
	        int count = charCount[i];
	        
	        // example : aaaaa
	        ans += (count/2*2) ;
	        if(ans % 2 == 0 && count % 2 == 1){
	            ans ++;
	        }
	    }
	    
	    return ans;
	 }
}
