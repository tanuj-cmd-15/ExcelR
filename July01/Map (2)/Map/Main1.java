import java.util.HashMap;

public class Main1{
    public static void main(String[] args) {
        
        //create a hashmap
        HashMap<String,Integer> languages = new HashMap<>();

        //add elements to hashmap
        languages.put("Java",8);
        languages.put("Javascript",1);
        languages.put("Python",4);
        System.out.println("HashMap of Languages: "+languages);

        //get() method to access values
        int value = languages.get("Java");
        System.out.println(value);

        //using keySet()
        System.out.println("Keys: "+ languages.keySet());

        //using values()
        System.out.println("Values: "+ languages.values());

        //entrySet()
        System.out.println("Key/Value mappings: "+languages.entrySet());

        //changing hashmap value - replace()
        languages.replace("Javascript", 10);
        System.out.println("Languages after replace(): "+ languages);


        HashMap<Integer,String> languages1 = new HashMap<>();

        languages1.put(101,"C");
        languages1.put(102,"C++");
        languages1.put(103,"Python");
        System.out.println("Languages1 Map: "+ languages1);

        //changing value for all - replaceAll()

        languages1.replaceAll((key, val) -> val.toUpperCase());
        System.out.println("Updated Map: "+ languages1);

        //remove Hashmap elements
        String element = languages1.remove(102);
        System.out.println("Removed Element: "+ element);

        System.out.println("After remove() "+languages1);

    }
}