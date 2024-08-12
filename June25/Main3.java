import java.util.Vector;
import java.util.Iterator;


public class Main3{
    public  static void main(String[] args){

        // vector list implementation 
        //creating a vector list with
        Vector<String> mammals = new Vector<>();

        //using add() method

        mammals.add("Dog");
        mammals.add("horse");

        // using indes add()
        mammals.add(1,"cat");
        System.out.println("List f mammals : "+ mammals);



        Vector<String> animals = new Vector<>();
        animals.add("Lion"); 
        animals.add("Tiger");


        // using addAll()
        animals.addAll(mammals);
        System.out.println("Merged list vector "+animals);



        //Accessing vector elements using get()
        String str = animals.get(2);
        System.out.println(str);

        // accesing vector element using iterator();
        Iterator<String> iterate = animals.iterator();
        System.out.println("Vector : ");
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(" ,");

        }

        // remove vectot elements using get

        String removeStr = animals.remove(2);
        System.out.println(removeStr);
        System.out.println("After removing "+ animals);


    //     // removeAll() 
    //     animals.removeAll(animals);
    //     System.out.println(animals);

    // clear()
    animals.clear();
    System.out.println(animals);
    }
}