public class Multidimension {
 public static void main(String[] args) {
    //multidimensional array
    double[][] matrix = {{1,2,3,4,6},{4,5,6}};
        
    //calculate the length of row
    System.out.println("length of the first row "+ matrix[0].length);

    //looping through multidimensional array

    int[][] a= {
        {1,2,-3},
        {-4,-5,6,9},
        {7}
    };

    //using for loop
    for(int i =0; i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.println(a[i][j]);
        }
    }
 }   
}
