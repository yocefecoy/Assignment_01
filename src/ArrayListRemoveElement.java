import java.util.ArrayList;

public class ArrayListRemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] input = {1, 2, 1, 3, 5, 1};



        for (int x : input) list.add(x);

        int key = 1;

        list.removeIf(n -> n == key);

        System.out.println(list);







    }
}
