import java.util.EnumSet;

import java.util.Iterator;

public class Main2{

    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    public static void main(String[] args){
        // using allOff(size) -creating enumset
        EnumSet<Size> Sizes1 = EnumSet.allOf(Size.class);

         //Creating Empty set  using noneOf()
         EnumSet<Size> Sizes2 =EnumSet.noneOf(Size.class);

        //Methods of EnumSet

        //Insert elements to EnumSet
        //Using Add()

        Sizes2.add(Size.MEDIUM);
        System.out.println("Enum set Uisng Add() "+Sizes2);

        // using AddAll  
        Sizes2.addAll(Sizes1);
        System.out.println("Enumset using addAll(): "+Sizes2);


        //accessing element using iterator()
        Iterator<Size> iterate = Sizes1.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
            
        }

        //remove enumset elements
        boolean val1 = Sizes1.remove(Size.MEDIUM);
        System.out.println("Removed element is: "+val1);

        boolean val2 = Sizes1.removeAll(Sizes1);
        System.out.println("remoeve all : "+val2);









       

        // //creating using range(e1,e2)
        // EnumSet<Size> sizes3 = EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
        // System.out.println("Using range "+sizes3);

        // //Using of() method to
        // EnumSet<Size> sizes4 = EnumSet.of(Size.MEDIUM);
        // System.out.println("Using of() method to "+sizes4);

        // EnumSet<Size> sizes5 = EnumSet.of(Size.MEDIUM,Size.EXTRALARGE);
        // System.out.println("using of() method to "+sizes5);


        
    }
}