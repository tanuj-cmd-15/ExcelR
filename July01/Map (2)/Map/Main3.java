import java.util.TreeMap;
public class Main3 {
    public static void main(String[] args) {
        
        //create TreeMap of even numbers
        TreeMap<Integer, String> evenNumbers = new TreeMap<>();

        //using put()
        
        evenNumbers.put(4, "Four");
        evenNumbers.put(6, "Six");
        evenNumbers.put(2,"Two");
        System.out.println("Even Numbers Map: "+evenNumbers);

        //using putIfAbsent()
        // evenNumbers.putIfAbsent("Ten",4);
        // System.out.println("Map after putIfAbsent() "+ evenNumbers);

        //create TreeMap of Numbers
        TreeMap<String, Integer> Numbers = new TreeMap<>();
        Numbers.put("One",1);

        //using putAll()
        // Numbers.putAll(evenNumbers);
        // System.out.println(Numbers);

        //Access TreeMap Elements  - entrySet(), keySet(), values()
        System.out.println("Using EntrySet(): "+ evenNumbers.entrySet());

        System.out.println("Keys of EvenNumbers Map: "+ evenNumbers.keySet());

        System.out.println("Values of EvenNumbers Map: "+ evenNumbers.values());

        //using get() and getOrDefault()
        String val = evenNumbers.get(4);
        System.out.println("Value of 4: " + val);

        String val2 = evenNumbers.getOrDefault(5, "Five");
        System.out.println(val2);

        //Remove(key) remove(key,val)
        String str = evenNumbers.remove(2);
        System.out.println("Removed Element: "+ str);
        System.out.println("Map after remove(): "+ evenNumbers);

        //remove with 2 parameters
        boolean result = evenNumbers.remove(5, "Five");
        System.out.println("Removed element is "+ result);

        //Replace TreeMap elements  - 2 parameters
        evenNumbers.replace(4, "Fourty Four");
        System.out.println("After Replace: "+ evenNumbers);

        //replace with 3 params
        evenNumbers.replace(6, "Six", "Sixty Six");
        System.out.println("after replace() with 3 params: "+evenNumbers);

        //using replaceAll()
        
        evenNumbers.replaceAll((key,oldValue)->oldValue+" Hundred");
        System.out.println("after replaceAll(): "+ evenNumbers);

        //Methods for Navigation

        int firstKey = evenNumbers.firstKey();
        System.out.println("First Key of EvenNumbers: "+ firstKey);

        System.out.println("First Entry: "+ evenNumbers.firstEntry());

        int lastKey = evenNumbers.lastKey();
        System.out.println("Last Key: "+ lastKey);

        System.out.println("Last Entry: " + evenNumbers.lastEntry());

        //pollFirstEntry() and pollLastEtry()
        System.out.println("pollFirstEntry(): "+ evenNumbers.pollFirstEntry());

        System.out.println("pollLastEntry(): "+ evenNumbers.pollLastEntry());

        System.out.println("after poll methods "+ evenNumbers);

        evenNumbers.put(4,"Four");
        evenNumbers.put(10, "Ten");
        evenNumbers.put(12,"Twelve");
        evenNumbers.put(16, "Sixteeen");

        //using higher()
        System.out.println("using higherKey(): "+ evenNumbers.higherKey(4));

        System.out.println("using higherEntry(): "+evenNumbers.higherEntry(10));

        //using lower()
        System.out.println("using lower():"+ evenNumbers.lowerKey(12));

        System.out.println("using lowerEntry()" + evenNumbers.lowerEntry(12));

        //headMap(),tailMap() and subMap() - part of the map

        //using headMap() - without boolean value
        System.out.println("without boolean value "+ evenNumbers.headMap(12));

        //using headMap() with boolean value

        System.out.println("With boolean value: " + evenNumbers.headMap(12, true));


        //tailMap() 
        System.out.println("using tailMap() without boolean value: "+ evenNumbers.tailMap(10));

        System.out.println("using tailMap() with boolean value: "+ evenNumbers.tailMap(10, false));
    
        //subMap() - without boolean value
        System.out.println("uisng subMap(): "+ evenNumbers.subMap(10,16));

        System.out.println("using subMap() with boolean value: "+ evenNumbers.subMap(10, true, 16, true));
        
    }
}
