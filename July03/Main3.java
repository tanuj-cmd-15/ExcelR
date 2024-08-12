import java.util.TreeSet;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<Integer>();
        //add
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(8);

        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.addAll(evenNumbers);
        System.out.println(numbers);

        //access elemnets TreeSet
        Iterator<Integer> itrate = numbers.iterator();
        System.out.println("TreeSet using Iterator : " );
        while(itrate.hasNext()){
            System.out.print(itrate.next());
            System.out.print(",");
        }

        //remove elemenys

        boolean val1 = numbers.remove(2);
        System.out.println("is element is remove ? "+val1);

        boolean val2 = numbers.removeAll(numbers);
        System.out.println("All elements removed ? "+val2);  

        //Navigation methods
        System.out.println("Number "+numbers);
        System.out.println("evennumber "+evenNumbers);


        //first() and low()
        System.out.println(" First elements of the set is : "+evenNumbers.first());
        System.out.println("Lst elements of the set is  : "+evenNumbers.last());

        //higer() and lower()
        System.out.println("Higher elements from 6 is "+evenNumbers.higher(6));
        System.out.println("Lower element of 6 is : "+evenNumbers.lower(6));


        //pollfirst() pollast()
        System.out.println("remove first element from the set is : "+evenNumbers.pollFirst());
        System.out.println("removed last elements from the set is : "+evenNumbers.pollLast());
        System.out.println("remaining elements in the set "+evenNumbers);


        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(6);
        evenNumbers.add(7);
        
        System.out.println("Even number set is "+ evenNumbers);
        //headset() and tailSet() and subset()

        System.out.println("Using headSet without booleqn value :"+evenNumbers.headSet(6));
        System.out.println("Using headSet with boolean value"+evenNumbers.headSet(6,true));

        System.out.println("Using tailSet without booleqn value :"+evenNumbers.tailSet(6));
        System.out.println("Using tailSet with boolean value"+evenNumbers.tailSet(6,false));


        System.out.println("Using a subset "+evenNumbers.subSet(3,false,7,true));

    }
}
