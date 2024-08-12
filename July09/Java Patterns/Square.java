class Square{
    public static void printPattern(int n){
        int i,j;
        for(i=0;i<n;i++){
            //inner loop to print
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                //otherwise print
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //function to print pattern
    public static void main(String[] args){
        int n =7;
        printPattern(n);
    }
}