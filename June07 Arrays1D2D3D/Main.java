public class Main{
    public static void main(String[] args) {
        //declaration of array
        int[] intArray = {1,2,3,4,5,6,7};
        double[] data = new double[5];
        //Inserting element in the array
        data[0]=2.5;
        data[1]=5.6;
        data[2]=6.1;
        data[3]=7.2;
        data[4]=9.2;

        System.out.println(data[1]);
        System.out.println(data[0]);

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }

        for( double i:data){
            System.out.println(i);
        }

        //multidimensional array
        double[][] matrix = {{1,2,3,4,6},{4,5,6}};
        
        //calculate the length of row
        System.out.println("length of the first row "+ matrix[0].length);

     }
}