import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //copying using the assignment operator
        int[] numbers ={1,2,3,4,5,6};
        int[] positivenumbers = numbers;

        //using looping contruct
        int[] source = {2,3,4,5,6,7,8};
        int[] destination = new int[8];

        for(int i=0;i<source.length;i++){
            destination[i] = source[i];
        }
        

        // 3) using arraycopy
        int[] n1 ={2,3,4,5,8,9,11,6};
        int[] n3 = new int[5];

        //creating n2 array to know the length of n1

        int[]  n2 = new int[n1.length];

        // copying entire n1 to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 ="+ Arrays.toString(n2));

        //copying from particular index

        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println(("n3 : "+ Arrays.toString(n3)));

        //4) Using coppyOfArray

        int[] src={2,3,4,5,7,9,10};

        //copy entire src aracy to dst
        int [] dst = Arrays.copyOfRange(src,0,src.length);
        System.out.println("destination arrar "+Arrays.toString(dst));

        int [] dst2 = Arrays.copyOfRange(src,1,4);
        System.out.println("destination array from 1 to 4 "+Arrays.toString(dst2));

    }
}
