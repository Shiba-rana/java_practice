public class ValidNumber {
    public boolean isValidNumber(String s) {
        if (s == null) return false;
        s = s.trim();
        
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
                
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                
            } else if (c == 'e' || c == 'E') {
                if (seenE || !seenDigit) {
                    return false;
                }
                seenE = true;
                seenDigit = false; 
                
            } else if (c == '.') {
                if (seenDot || seenE) {
                    return false;
                }
                seenDot = true;
                
            } else {
                return false;
            }
        }
        
        return seenDigit;
    }
    public static void main(String[] args) {
        ValidNumber solution = new ValidNumber();
    
        String[] testInputs = {
            "2", "0.08", "-1.1", "3e+7", "+6e-1", "53.5e93",
            "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3"
        };
    
        for (String test : testInputs) {
            boolean isValid = solution.isValidNumber(test);
            System.out.printf("%-10s -> %s\n", "\"" + test + "\"", isValid ? "VALID" : "INVALID");
        }
    }
}



