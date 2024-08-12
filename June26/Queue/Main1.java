import java.util.*;
public class Main1{

    public static void main(String[] args) {
        //creating queue using likedlist

        Queue<Integer> numbers = new LinkedList<Integer>();

        //create queue using ArrayDequeue
        Queue<String> Animals = new ArrayDeque<String>();

        //priority queu
        Queue<Integer> nums = new PriorityQueue<Integer>();


        //offer elements to the queue
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);
        System.out.println(numbers);

        //accessing the element of queue  
        int accessNum = numbers.peek();
        System.out.println(accessNum); 

        //remove elements from the queue
        int removeNum = numbers.poll();
        System.out.println(removeNum);

        System.out.println(numbers);
    }

}