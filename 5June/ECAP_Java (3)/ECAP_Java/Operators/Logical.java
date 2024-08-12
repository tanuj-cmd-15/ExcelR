public class Logical {
    public static void main(String[] args) {
        //Logical AND - return true if both conditions are true

        int x = 50, y=20, z =30;
        System.out.println(x>y && x>z);

        //Logical || - returns true if one condition is true 

        System.out.println(x<y || x>z); 

        //Logical Not - Reverse the result

        System.out.println(!(x>y&&x>z));
    }
}
