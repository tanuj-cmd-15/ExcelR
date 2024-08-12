public class Car{
    
        //State or field
        String model = " Suzuki";
        int Year = 1995;
        //behaiour / method
        public void start(){
            System.out.println(model);
        }
}
class Main{
       public static void main(String[] args) {
         //create an object with
         Car Car_Obj = new Car();

         //Access field and methods
         Car_Obj.start();
       }
}