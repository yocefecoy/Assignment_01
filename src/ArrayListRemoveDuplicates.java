import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);

        System.out.println("ArrayList after removing duplicates: " + numbers);
    }
}
