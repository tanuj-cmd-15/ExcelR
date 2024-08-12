import java.util.Scanner;

class MyClass{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name ");

        String userName = obj.nextLine();
        System.out.println("Username = "+userName);
    }
}