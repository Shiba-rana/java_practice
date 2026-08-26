import java.util.Objects;

public class ShortestandLexicographicallySmallestBeautifulString {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int ones = 0;
        int l = 0;
        
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == '1') {
                ones++;
            }
            
            while (ones == k) {
                String currentStr = s.substring(l, r + 1);
                
                if (ans.isEmpty() || currentStr.length() < ans.length()) {
                    ans = currentStr;
                } else if (currentStr.length() == ans.length() && currentStr.compareTo(ans) < 0) {
                    ans = currentStr;
                }
                
                if (s.charAt(l) == '1') {
                    ones--;
                }
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ShortestandLexicographicallySmallestBeautifulString solver = new ShortestandLexicographicallySmallestBeautifulString();

        String s1 = "100011001";
        int k1 = 3;
        String res1 = solver.shortestBeautifulSubstring(s1, k1);
        System.out.println("Test 1 Result: '" + res1 + "' | Expected: '11001'");

        String s2 = "1011";
        int k2 = 2;
        String res2 = solver.shortestBeautifulSubstring(s2, k2);
        System.out.println("Test 2 Result: '" + res2 + "' | Expected: '11'");
    }
}
