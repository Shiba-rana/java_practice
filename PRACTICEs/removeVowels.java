import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        removeVowels(s);

    }

    public static void removeVowels(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                continue;
            }

            System.out.print(ch);
        }
    }
}
