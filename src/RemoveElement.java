public class RemoveElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int remove = 3;

        System.out.print("Array after removing " + remove + ": ");
        for (int num : numbers) {
            if (num != remove) {
                System.out.print(num + " ");
            }
        }
    }
}
