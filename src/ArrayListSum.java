import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of ArrayList elements: " + sum);
    }
}
