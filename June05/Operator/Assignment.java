public class Assignment {
    public static void main(String[] args) {
        
        int x =10;
        int y = x;
         //assignment += assignment
         x+=5;
         System.out.println(x); 

        //  assignment -= 
        x-=5;
        System.out.println(x);

        //assignment *= 
        x*=5;
        System.out.println(x);

        // assignment /= 
        x/=5;
        System.out.println(x); //

        // assignment %= 
        x%=3;
        System.out.println(x);

        // assignment &= 0
        y&=1;
        System.out.println(y);

        // assignment |=
        x|=3;
        System.out.println(x);

        //Assignment ^= -- return 0 if both bits are same otherwise 1
        x^=3;
        System.out.println(x);


        



    }
}
