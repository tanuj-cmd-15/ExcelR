import java.util.LinkedHashSet;
import java.util.Iterator;
public class Main2 {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet();

        //add()
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);evenNumbers.add(8);
        System.out.println("evenumbers set : "+evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.addAll(evenNumbers);
        System.out.println("Numbers "+numbers);


        //Iterator
        Iterator<Integer> itrate = numbers.iterator();
        System.out.println("LinkedHashSet using Iterator: ");

        //accessing elements
        while (itrate.hasNext()) {
            System.out.print(itrate.next());
            System.out.print(",");
            
        }


        //remove elements
        boolean val1 = numbers.remove(2);
        System.out.println("Is elemet removed ? "+val1);

        boolean val2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed "+val2);


        //Union intersection and subset

        evenNumbers.add(4);
        evenNumbers.add(8);
        evenNumbers.add(12);

        numbers.add(2);
        numbers.add(6);
        numbers.add(10);

        numbers.addAll(evenNumbers);
        System.out.println("Union of set : "+numbers);


        // Intersection of 2 set  
        numbers.retainAll(evenNumbers);
        System.out.println("Intersection of two elements "+numbers);

        boolean result = numbers.containsAll(evenNumbers);
        System.out.println("Is the evenNumbers is subset of number ? "+result);



    }
}
