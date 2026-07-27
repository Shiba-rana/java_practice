import java.util.*;

public class LargestNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxVaule = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int curr = sc.nextInt();
            maxVaule = Math.max(maxVaule, curr);
        }
        System.out.println(maxVaule);
    }
}
