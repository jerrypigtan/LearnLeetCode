package Test;

public class _0392_IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int sLeftPointer = 0;
        int tLeftPointer = 0;

        while(sLeftPointer < sLength && tLeftPointer < tLength){
        	
            if(s.charAt(sLeftPointer) == t.charAt(tLeftPointer)){
                sLeftPointer++;
            }

            tLeftPointer++;     
        }
        
        return sLeftPointer == sLength;
    }
}
