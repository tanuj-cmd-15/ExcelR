public class Split {
    public static void main(String[] args) {
        String str= "Java is a programming languagbe";

        //Spilt string from  space
        String[] result = str.split(" ");

        System.out.println("result = ");
        for(String s: result){
            System.out.println(s + " ");
        }
    }    
}
