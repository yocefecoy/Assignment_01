import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[numbers.length];
        int j = 0;

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[numbers.length - 1];

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
