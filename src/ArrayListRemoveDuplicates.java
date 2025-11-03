import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] input = {1, 2, 2, 3, 3, 4, 5};
        for (int x : input) list.add(x);




        ArrayList<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(result);
    }
}
