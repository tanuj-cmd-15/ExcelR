import java.util.LinkedHashMap;

public class Main2 {
    public static void main(String[] args) {
        

        //create HashMap
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        //add entries to the map
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        System.out.println("LinkedHashMap: "+ evenNumbers);

        //putAll() - 
        LinkedHashMap<String,Integer> numbers = new LinkedHashMap<>();
        numbers.putAll(evenNumbers);
        numbers.put("one",1);

        System.out.println(numbers);

        //putIfAbsent()
        numbers.putIfAbsent("Eight", 8);
        System.out.println(numbers);

        numbers.putIfAbsent("one", 1);
        System.out.println(numbers);

        //access using entrySet() keySet() and values()

        System.out.println("Entries of Numbers map: "+ numbers.entrySet());

        System.out.println("Keys of Numbers Map: "+ numbers.keySet());

        System.out.println("Values of Numbers Map: "+ numbers.values());

        //get() and getOrDefault()

        int val = numbers.get("Eight");
        System.out.println(val);

        int val1 = numbers.getOrDefault("Ten", 10);
        System.out.println(val1);

        //Remove Elements from Map
        int ele = numbers.remove("Eight");
        System.out.println("Removed Element: "+ ele);

        System.out.println(numbers);

        boolean bool = numbers.remove("Three", 3);
        System.out.println(bool);

    }
}
