import java.util.Scanner;
public class Ternary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks : ");
        double marks = input.nextDouble();

        String result = (marks>40) ? " Pass" : "Fail";

        System.out.println("You "+ result+" the exam");
        input.close();
    }
}
