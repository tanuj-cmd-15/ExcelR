public class StringBulilders {
    
    public static void main(String[] args) {

//Normal string with string class
        String str = "Hello";
        System.out.println(str.concat(" world"));
        System.out.println(str);

        //String with StringBuilder class
        StringBuilder str1 = new StringBuilder("Hello");

        str1.append(" world");
        System.out.println(str1);
    }
}
