import java.util.TreeMap;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        
        // TreeMap comparator
        TreeMap<String,Integer> numbers = new TreeMap<>(new CustomComparator());

       numbers.put("First",1);
       numbers.put("Six",6);
       numbers.put("Seven ",7);
       numbers.put("Two",2);

        System.out.println("Numbers TreeMap: "+ numbers);
    }

    //creating comparator class
   public static class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String number1, String number2){
        int value = number1.compareTo(number2);

        //elements are sorted in reverse order
        if(value>0){
            return -1;

        }else if(value<0){
            return 1;
        }
        else{
            return 0;
        }
    }
   }
}
