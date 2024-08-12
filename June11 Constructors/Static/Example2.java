public class Example2 {

    //Static variable
    static int max =10;

    //non Static variable
    int min=2;
    

    // non static method
    int multiply(int a, int b){
        return a+b;       
    }

    //static method
    static int add(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        //create an  instance of exampel2 class
        Example2 obj = new Example2();

        //invoking the non static method
        System.out.println("2+ 3 "+obj.multiply(2,3));

        //call the static method
        System.out.println(Example2.add(2,6));


        //accesing the static variable
        System.out.println(Example2.max);

        //Accessing the non static vairable
        System.out.println(obj.min);
    }
}
