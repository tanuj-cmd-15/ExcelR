public class Logical {
    public static void main(String[] args) {
        //Logical AND - return true if both conditiona re are true static void main(String[] args) {
        int x = 10, y =20, z=10;

        System.out.println(x>10 && y<z);

        //OR
        System.out.println(x<y || y<z);

        //LOgical NOT
        System.out.println(!(x<y&&x==z));
    }
}
