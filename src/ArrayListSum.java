import java.util.ArrayList;

public class ArrayListSum {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);

        int sum=0;
        for (int num : numbers){
            sum +=num;
        }
        System.out.println("sum= "+sum);
    }

}
