import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> nums =  List.of(10, 15, 20, 25, 30, 35);

        // Find all even numbers.
        List<Integer> evenNums = nums.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenNums);

        // Find all numbers greater than 20.
        List<Integer> greaterThan = nums.stream().filter(num -> num > 20).toList();
        System.out.println(greaterThan);

        // Convert every number to its square.
        List<Integer> squareNum = nums.stream().map(num -> num * num).toList();
        System.out.println(squareNum);

        // Find the sum of all numbers.
        List<Integer> sumOfNums = nums.stream().reduce((a, b) -> a + b).stream().toList();

        // int sumOfNums = nums.stream().reduce(0, Integer::sum);
        
        System.out.println(sumOfNums);
    }
}
