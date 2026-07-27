import java.util.Scanner;
public class Si {
    public static void main(String[] args) {
        /*
        int P = 100, R = 5,T = 2;

        int si = (P * R * T)/100;

        System.out.print(si);
         */

        Scanner sc = new Scanner(System.in);

        int P= sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();

        int si = (P * R * T)/100;

        System.out.print(si);
    }
}
