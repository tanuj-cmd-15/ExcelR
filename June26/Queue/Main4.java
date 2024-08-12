import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;


public class Main4 {

    public static void main(String[] args) {
        BlockingQueue<String>  animals = new ArrayBlockingQueue<String>(5);


        //Insert elements to blocking queue
        
try{
    animals.put("Dog");
    animals.put("Cat");
    animals.put("Tiger");
    System.out.println(animals);

    String str = animals.take();
    System.out.println(str);
    
    System.out.println(animals);
}catch(Exception e){
    e.getStackTrace();
}

    }
}
