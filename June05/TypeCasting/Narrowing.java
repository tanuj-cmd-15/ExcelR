public class Narrowing {
    public static void main(String[] args) {
        double myDouble = 5.76d;
        int myInt =(int) myDouble;

        System.out.println(myInt);
        System.out.println(myDouble);


        int maxScore = 500;
        int userScore = 441;
        //calculate %
        float percentage = (float)userScore / (float)maxScore *100.0f;
        System.out.println("user percentage score "+percentage);
    }
    
}
