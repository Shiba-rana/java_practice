import java.util.Scanner;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        reverseVowels(s);
    }

    public static void reverseVowels(String s) {
        char[] st = s.toCharArray();

        int i = 0;
        int j = st.length -1;

        while (i < j) {
            while (i < j && st[i] != 'A' && st[i] != 'a' && st[i] != 'E' && st[i] != 'e' && st[i] != 'I' && st[i] != 'i' && st[i] != 'O' && st[i] != 'o' && st[i] != 'U' && st[i] != 'u') {
                i++;
            }

            while (i < j && st[j] != 'A' && st[j] != 'a' && st[j] != 'E' && st[j] != 'e' && st[j] != 'I' && st[j] != 'i' && st[j] != 'O' && st[j] != 'o' && st[j] != 'U' && st[j] != 'u') {
                j--;
            }

            if(i >= j) {
                break;
            }

            char ch = st[i];
            st[i] = st[j];
            st[j] = ch;

            i++;
            j--;
        }

        System.out.println(new String(st));
    }
}
