class Data{
    //private cariable
    private String name;

    public String getName(){
        return this.name;
    }

    public void setNmae(String name){
        this.name = name;
    }
}


public class Main2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.setNmae("john");
        System.out.println(d.getName());
    }
}
