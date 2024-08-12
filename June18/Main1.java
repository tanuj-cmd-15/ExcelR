class Language{
    public void display(){
        System.out.println("common English language ");
    }
}

class Java extends Language{
    @Override
    public void display(){
        System.out.println("Java programming");
    }
}


public class Main1 {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.display();

        Language l1 = new Language();
        l1.display();
    }
}
