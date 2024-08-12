import java.util.EnumSet;

public class Main1{

    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    public static void main(String[] args){
        // using allOff(size) -creating enumset
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet : " + sizes);

        //Creating Empty set  using noneOf()
        EnumSet<Size> Sizes2 =EnumSet.noneOf(Size.class);
        System.out.println("Empty EnumSet : " + Sizes2);

        //creating using range(e1,e2)
        EnumSet<Size> sizes3 = EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
        System.out.println("Using range "+sizes3);

        //Using of() method to
        EnumSet<Size> sizes4 = EnumSet.of(Size.MEDIUM);
        System.out.println("Using of() method to "+sizes4);

        EnumSet<Size> sizes5 = EnumSet.of(Size.MEDIUM,Size.EXTRALARGE);
        System.out.println("using of() method to "+sizes5);



        //Methods of EnumSet

        //Insert elements to EnumSet

        
    }
}