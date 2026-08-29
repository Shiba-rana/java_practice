public class CountAndSay {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int len = result.length();
            int j = 0;

            while (j < len) {
                char currentDigit = result.charAt(j);
                int count = 0;

                while (j < len && result.charAt(j) == currentDigit) {
                    count++;
                    j++;
                }
                sb.append(count).append(currentDigit);
            }
            result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        CountAndSay solution = new CountAndSay();

        int test1 = 1;
        int test2 = 4;
        int test3 = 5;

        System.out.println("n = " + test1 + " -> " + solution.countAndSay(test1));
        System.out.println("n = " + test2 + " -> " + solution.countAndSay(test2));
        System.out.println("n = " + test3 + " -> " + solution.countAndSay(test3));
    }
}
