import java.util.HashMap;
import java.util.Hashtable;
import java.util.WeakHashMap;

public class Main5 {
    public static void main(String[] args) {
        
        //weakHashMap with capacity - 16 and load factor 0.75(default)

        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();
        // HashMap<String, Integer> numbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;
        String three = new String("Four");
        Integer threeValue = 3; 

        //Inserting elements 
        numbers.put(two,twoValue);
        numbers.put(four,fourValue);
        System.out.println("WeakHashMap: "+ numbers);

        //make the reference null
        // two=null;

        //perform garbage collection
        // System.gc();

        // System.out.println("WeakHashMap after garbage collection: "+ numbers);

        //Inserting elments 
        String Six = new String("Six");
        Integer sixValue = 6;

        //put method
        numbers.put(Six,sixValue);
        System.out.println("WeakHashMap: "+ numbers);

        //creating weakHashMap of  evenNumbers 
        WeakHashMap<String, Integer> evenNumbers = new WeakHashMap<>();

        evenNumbers.putAll(numbers);

        //putIfAbsent()
        evenNumbers.putIfAbsent(three,threeValue);
        System.out.println("After putIfAbsent(): "+ evenNumbers);


        //Access WeakHashMap elements 
        System.out.println("WeakHashMap using entrySet(): "+ evenNumbers.entrySet());

        System.out.println("WeakHashMap using keySet(): "+ evenNumbers.keySet());

        System.out.println("WeakHashMap using Value():"+ evenNumbers.values());

        //access using get() and getOrDefault()
        int val1 = evenNumbers.get("Four");
        System.out.println("Using get(): "+val1);

        int val2 = evenNumbers.getOrDefault("Eight", 8);
        System.out.println("using getOrDefault(): "+ val2);

        //Remove WeakHashMap Elemenets 
        int ele = evenNumbers.remove("Four");
        System.out.println("Removed value: "+ele);

        boolean result = evenNumbers.remove("Six", 66);
        System.out.println("The element has been removed? "+ result);



    }
}
