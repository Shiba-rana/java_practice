import java.util.Scanner;

class Factorial {
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }

        int res = n * factorial(n - 1);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
