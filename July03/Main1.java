import java.util.HashSet;
import java.util.Iterator;

public class Main1{
    public static void main(String[] args){
        HashSet<Integer> numbers1 = new HashSet<Integer>();

        //Insert elements to hashset

        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        System.out.println("Numbers set "+numbers1);
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.addAll(numbers1);
        System.out.println("numbers set 2 "+numbers);

        
        //access hashSet elemnets - iterator()
        Iterator<Integer> itrate = numbers.iterator();
        System.out.println("HashSet using Iterator : "+itrate);
        //accesing elements
        while(itrate.hasNext()){
            System.out.print(itrate.next());System.out.print(" ,");
        }


        //remove elements

        boolean val1 = numbers.remove(5);
        System.out.println("is 5 removed ?  "+val1);

        boolean val2 = numbers.removeAll(numbers);
        System.out.println("are all elements remove "+val2);

        System.out.println("numbers "+numbers);


        //union of 2 sets
        HashSet<Integer> evenNumbers = new HashSet<Integer>();

        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        HashSet<Integer> Numbers = new HashSet<Integer>();
        Numbers.add(1);
        Numbers.add(3);
        Numbers.add(5);

        Numbers.addAll(evenNumbers);
        System.out.println("union of 2 sets "+Numbers);

        //Itersection of sets
        System.out.println("Number set "+Numbers);
        System.out.println("EvenNumber set : "+evenNumbers);

        Numbers.retainAll(evenNumbers);
        System.out.println("Intersection is : "+Numbers);

        //subset - check if a set is part of another ste - containAll()

        boolean result = Numbers.containsAll(evenNumbers);
        System.out.println(("Is HahSet2 (evenNumbers) is subset of number set: "+result));


    }
}