public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int count = 0;
        int[] arr2 = new int[arr.length];

        for (int num : arr) {
            if (num != key) {
                arr2[count++] = num;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(arr2[i]);
        }
    }
}
