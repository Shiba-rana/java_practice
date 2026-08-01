import java.math.BigInteger;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int x = sc.nextInt();

        int ans = 1;
        for(int i = 1; i <= x; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
        */

        int x = sc.nextInt();

        BigInteger ans = new BigInteger("1");

        for(int i = 1; i <= x; i++) {
            BigInteger temp = new BigInteger(i + "");
            ans = ans.multiply(temp);
        }
        System.out.println(ans);
    }
}
