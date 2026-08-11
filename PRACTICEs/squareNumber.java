import java.util.*;
class squareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        square(num);
    }

    static void square(int num) {
        
        System.out.println(num*num);
    }
}
