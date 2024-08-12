import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();


        //using add()

        numbers.add(20);
        numbers.add(15);
        System.out.println(numbers);
        numbers.add(5);

        System.out.println(numbers);

        int num = numbers.peek();
        System.out.println(num);

        System.out.println(numbers);

        //removing elements from head remove

        boolean result = numbers.remove(20);
        System.out.println(result);

        //using poll()

        int num1 = numbers.poll();
        System.out.println(numbers);
        int num2 = numbers.poll();
        System.out.println(numbers);
        System.out.println("gives the null value when queue is empty ------> "+numbers.poll());
        
        System.out.println("remove method gives exception when queue is empty"+numbers.remove());

  



    }
}
