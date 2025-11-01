import java.util.ArrayList;

public class ArrayListRemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int remove = 3;
        numbers.remove(Integer.valueOf(remove));

        System.out.println("ArrayList after removing " + remove + ": " + numbers);
    }
}
