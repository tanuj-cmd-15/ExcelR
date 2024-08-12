import java.util.LinkedHashMap;

public class Main2 {

    public static void main(String[] args) {
        
        //create HashMap
        LinkedHashMap<String,Integer> evenNumbers = new LinkedHashMap<String,Integer>();

        //add enteris yo the map\
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        System.out.println("LikedHasMap "+evenNumbers);

        //putAll() - the map
        LinkedHashMap<String,Integer> numbers = new LinkedHashMap<String,Integer>();
        numbers.putAll(evenNumbers);
        numbers.put("One",1);
        System.out.println(numbers);

        // putIfAbsent 
        numbers.putIfAbsent("Eight",8);
        System.out.println(numbers);

        numbers.putIfAbsent("Eight",8);
        System.out.println(numbers);

        //access using entrySet() keySet() and values()

        System.out.println("enteries of number map: "+numbers.entrySet());
        System.out.println("keys of number map: "+numbers.keySet());
        System.out.println("values of number map: "+numbers.values());


        //get and getOrDefault

        int val = numbers.get("Eight");
        System.out.println(val);

        int val1 = numbers.getOrDefault("Ten",10);
        System.out.println(val1);

        // remove elements from  Map
        int ele = numbers.remove("Eight");
        System.out.println("removed  items "+ele);
        System.out.println(numbers);


        boolean bool = numbers.remove("One",1);
        System.out.println(bool);
        System.out.println(numbers);


    }
    
}
