public class Example2 {
    
    String languages;

    Example2(String lang){
        languages= lang;
        System.out.println(" Programming languages :"+languages);
    }

    public static void main(String[] args) {
         Example2 obj1 = new Example2("java");
         Example2 obj2 = new Example2("c");
         Example2 obj3 = new Example2("C++");
         Example2 obj4 = new Example2("JS");
    }
}
