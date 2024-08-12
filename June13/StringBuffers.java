public class StringBuffers{

    public static void main(String[] args) {
        

        //Creqating a new string with String buffer class
        StringBuffer str = new StringBuffer("Hello");
        //stringBuffer creats mutable string
        System.out.println(str);

        str.append(" World");
        System.out.println("String after modefication (original string changed ) :");
        System.out.println(str);

        String str1 = "Hello";
        System.out.println(str1.concat(" World "));
        System.out.println("String after modification (Orginal string not changed  ) :");
        System.out.println(str1);
        System.out.println(str);

    }
}