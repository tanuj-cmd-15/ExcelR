import java.util.ArrayList;
import java.util.List;



public class Main1 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList();
        //add elements to the list
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);

        System.out.println(numbers);

        //access particular element from list
        int number = numbers.get(2);
        System.out.println(number);

        //remove the element  from the list
        int removeNumber = numbers.remove(1);
        System.out.println(removeNumber);

        System.out.println(numbers);
        
    }
}