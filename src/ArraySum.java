import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args){
        int [] array= {2,4,6,7,9};

        int sum =0;
        for(int i: array) sum += i ;

        System.out.println(sum);
    }
}
