package Test;

public class _1768_MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Time: O(m+n)
	// Space: O(1)
	// one pointer
    public static String mergeAlternately(String word1, String word2) {
		int x = word1.length();
		int y = word2.length();
		int maxLength = Math.max(x, y);
		
		StringBuilder result = new StringBuilder();
		
    	for(int i = 0; i < maxLength; i++) {
    		// stop append if index greater than length
    		// append if index less than length
    		if(i < x) {
    			result.append(word1.charAt(i));
    		}
    		if(i < y) {
    			result.append(word2.charAt(i));
    		}
    	}
    	
    	return result.toString();
    }
}
