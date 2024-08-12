import java.util.Scanner;

public class Main{
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the  intger : ");
            int number = input.nextInt();
            System.out.println("You have entered "+number);

            //take float as input
            System.out.println("enter the float : ");
            float myFloat = input.nextFloat();
            System.out.println("float no is : "+ myFloat);

            //take float as input
            System.out.println("enter the double : ");
            double myDouble = input.nextDouble();
            System.out.println("double no is : "+ myDouble);

            //closing input object
            input.close();
    }
}