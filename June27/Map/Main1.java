import java.util.HashMap;

public class Main1{
    public static void main(String[] args){
        //create a hasmap
        HashMap<String,Integer> languages = new HashMap<>();

        //add elements to hashmap
        languages.put("Java",8);
        languages.put("JS",9);
        languages.put("Python",1);
        System.out.println("Hashmap of languages "+languages);

        //get() method to get the values
        int lang1 = languages.get("Java");
        System.out.println(lang1);

        //Using keySet() method to get the values
        System.out.println("keys : "+languages.keySet());

        //using values()
        System.out.println("values : "+languages.values());

        //entrySet()
        System.out.println("jey/value mapping "+languages.entrySet());

        //changing the hashmap value - replace()
        languages.replace("JS",10);
        System.out.println("languages Hashmap after replce() "+languages);




        HashMap<Integer,String> languages1 = new HashMap<>();

        languages1.put(1,"c");
        languages1.put(2,"c++");
        languages1.put(3,"python");

        // changing value for all - replcaeAll()
        languages1.replaceAll((key,value) -> value.toUpperCase());
        System.out.println("updates hashmap values "+languages1);

        // remove Hashmap elements
        String element = languages1.remove(2);
        System.out.println("after remove "+languages1);

    }
}