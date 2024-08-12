import java.util.*;


public class Main3 {
    
    public static void main(String[] args) {
        //Array implementation of dequeue
        Deque<String> animal1 = new ArrayDeque<String>();

        //LikedList implementation of deque
        Deque<String> animal2 = new LinkedList<String>();



        //add elements to dque
        animal1.offer("DOG");
        animal1.offer("Lion");
        animal1.offer("cat");
        animal1.offer("Tiger");

        System.out.println("Deque: "+animal1);

        //accessing elements from dqueue
        String firstElement = animal1.peekFirst();
        System.out.println("first element  : "+firstElement);

        String lastElement = animal1.peekLast();
        System.out.println("this is the last element "+lastElement);


        //remove element from deque
        System.out.println(animal1.removeFirst());
        System.out.println(animal1.removeLast());
        System.out.println(animal1);

    }
}
