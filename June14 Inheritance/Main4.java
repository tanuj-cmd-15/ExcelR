class A{
    public void Print_A(){
        System.out.println("Class_A");
    }
}
class B extends A{
    public void Print_B(){
        System.out.println("CLASS B");
    }
}

class C extends A{
    public void Print_C(){
        System.out.println("CLASS C");
    }
}

class D extends A{
    public void Print_D(){
        System.out.println("CLASS D");
    }
}

public class Main4 {


    public static void main(String[] args) {
        B obj_B = new B();
        obj_B.Print_A();
        obj_B.Print_B();

        C obj_C = new C();
        obj_C.Print_A();
        obj_C.Print_C();

        D obj_D = new D();
        obj_D.Print_A();
        obj_D.Print_D();
    }
}
