import java.util.*;
// import java.util.Scanner;

public class removePrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array input
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        for(int i = list.size() - 1; i >= 0; i--) {
            if(isPrime(list.get(i))) list.remove(i);
        }
        System.out.println(list);

    }

    public static boolean isPrime(int num) {
        if(num < 2 ) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
