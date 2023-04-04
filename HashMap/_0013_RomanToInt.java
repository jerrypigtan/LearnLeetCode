package Test;

import java.util.HashMap;
import java.util.Map;

public class _0013_RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("III is equal to ");
		System.out.print(romanToInt("III"));
		System.out.println();
		
		System.out.print("IV is equal to ");
		System.out.print(romanToInt("IV"));
		System.out.println();
		
		System.out.print("IV is equal to ");
		System.out.print(romanToInt("IV"));
		System.out.println();
	}
	
	// Example 1
	// Input: s = "III"
	// Output: 3
	// Explanation: III = 3.
	
	//Input: s = "LVIII"
	//Output: 58
	//Explanation: L = 50, V= 5, III = 3.
	
	//	Input: s = "MCMXCIV"
	//	Output: 1994
	//	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
			
    // concept must know
	// I can be placed before V (5) and X (10) to make 4 and 9. 
	// X can be placed before L (50) and C (100) to make 40 and 90. 
	// C can be placed before D (500) and M (1000) to make 400 and 900.
    public static int romanToInt(String s) {
        int ans = 0;
        int i = 0;
        Map<Character, Integer> map = build();
        
        while(i < s.length()) {
            char c = s.charAt(i);
            if((c == 'I' || c == 'X' || c == 'C') && (i+1 < s.length())) {
                char nextC = s.charAt(i+1);
                
                // https://www.numere-romane.ro/rule3-subtraction-of-basic-symbols-in-roman-numerals.php?lang=en
                // the subtractive notation of the Roman numerals: placing lower value symbols in front of larger value ones
                if((c == 'I' && (nextC == 'V' || nextC == 'X')) ||
                   (c == 'X' && (nextC == 'L' || nextC == 'C')) ||
                   (c == 'C' && (nextC == 'D' || nextC == 'M'))){
                    ans += (map.get(nextC) - map.get(c));
                    i += 2;
                    continue;
                }
            }
        
            ans += map.get(c);
            i++;
        }
                   
        return ans;
    }
    
    // must to know
	//  I	V	X	L	C	 D	    M
	//  1	5	10	50	100	 500	1000
    private static Map<Character, Integer> build() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        return map;
    }
}
