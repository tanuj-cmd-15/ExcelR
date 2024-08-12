import java.util.TreeMap;

public class Main1 {
 public static void main(String[] args) {
    
    TreeMap<String, Integer> evennumbers = new TreeMap<>();

    //Using put()
    evennumbers.put("Two",2);
    evennumbers.put("Four",4);
    evennumbers.put("Six",6);


    System.out.println(evennumbers);


    //using putIfAbsent method
    evennumbers.putIfAbsent("Four",4);
    System.out.println("using putIfAbsent for 4 "+evennumbers);
    evennumbers.putIfAbsent("Eight",4);
    System.out.println("add new num using putifabsent"+evennumbers);

    //create TreeMap of Numbers
    TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();
    numbers.put("one",1);
    numbers.putAll(evennumbers);
    System.out.println("Putall use add alll values"+numbers);




 }
}