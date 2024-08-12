import java.util.LinkedList;

public class Main2{
    public static void main(String[] args){

        // create Linkedlsit 
        LinkedList<String> animal = new LinkedList<String>();

        //new elemest add
        animal.add("Dog");
        animal.add("cat");
        animal.add("Lion");
        animal.add("Tiger");
        System.out.println(animal);


        // add method with indx
        animal.add(1,"Elephant");
        System.out.println(animal);

        //accessing list elements
        String str = animal.get(1);
        System.out.println(str);

        //change element in the list
        animal.set(2, "FOX");
        System.out.println(animal);

        //remove the element from list
        String removeStr = animal.remove(1);
        System.out.println("remove Itm "+removeStr);

        System.out.println("list after item remove "+animal);

        //iterating through linkedlist
        for(String animals:animal){
            System.out.println(animals);
        }

    }
}