public class ThreeD {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        { 1, 2, -3 },
                        { 2, 3, 5 }
                },
                {
                        { 4, 5, 6, 3 },
                        { 2, 3, 9, 7 },
                        { 2, 1 }
                }
        };
        for(int[][] array2D: array){
            for(int[] array1D:array2D){
                for(int item: array1D){
                    System.out.println(item);
                }
            }
        }
    }
}
