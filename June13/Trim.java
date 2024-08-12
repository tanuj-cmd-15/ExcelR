public class Trim {
    public static void main(String[] args) {
        String str = "    Hello world";

        // using the trim you can remove the whitespace 
        System.out.println(str.trim());


        String str1 =" Hello World";
        String str2 = " hello world";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }


}
