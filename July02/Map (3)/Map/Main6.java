import java.util.EnumMap;

public class Main6 {

    enum Size {
        SMALL,MEDIUM,LARGE,EXTRALARGE

        
    }
    public static void main(String[] args) {
        
        //EnumMap of the Size Enum
        EnumMap<Size,Integer> sizes1 = new EnumMap<>(Size.class);

        //using put() method
        sizes1.put(Size.SMALL,28);
        sizes1.put(Size.MEDIUM,32);
        System.out.println("EnumMap1: "+sizes1);

        EnumMap<Size,Integer> sizes2 = new EnumMap<>(Size.class);

        //putAll() method
        sizes2.putAll(sizes1);
        sizes2.put(Size.LARGE,36);
        System.out.println("EnumMap2: "+ sizes2);


        //Using entrySet(), keySet() and values()
        System.out.println("Key/Value Mapping: "+sizes1.entrySet());

        System.out.println("Keys of Sizes1 Map: "+sizes1.keySet());

        System.out.println("values of Sizes1 Map: "+sizes1.values());

        //get()
        int val1 = sizes1.get(Size.SMALL);
        System.out.println("Value of Small: "+ val1);

        //removing elements using remove()
        int ele = sizes1.remove(Size.SMALL);
        System.out.println("Removed Element: "+ ele);

        boolean result = sizes1.remove(Size.MEDIUM, 32);
        System.out.println("Is the entry removed? "+ result);

        //replace()
        sizes2.replace(Size.LARGE, 40);
        sizes2.replace(Size.MEDIUM, 32, 36);
        System.out.println("Sizes Map:  after replace() "+sizes2);

        //replaceAll()
        sizes2.replaceAll((key,oldval)->oldval+2);
        System.out.println("After replaceAll(): "+ sizes2);

       
    }
}
