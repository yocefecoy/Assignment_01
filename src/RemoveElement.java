import java.util.Arrays;

public class RemoveElement {

    public static int[] removeAllOccurrences(int[] arr, int key) {

        int count = 0;
        for (int value : arr) {
            if (value != key) count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int value : arr) {
            if (value != key) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arra = {1, 2, 1, 3, 5, 1};
        int key = 1;

        int[] r = removeAllOccurrences(arra, key);
        System.out.println(Arrays.toString(r));
    }
}
