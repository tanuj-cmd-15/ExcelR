public class No_Arg {
    
    int i;
    // Constructor with no parametere
    private No_Arg(){
        i=5;
        System.out.println("Constructor is called :");

    }

    public static void main(String[] args) {
        No_Arg obj = new No_Arg();
        System.out.println("Valur of obj is "+ obj.i);
        
    }
}
