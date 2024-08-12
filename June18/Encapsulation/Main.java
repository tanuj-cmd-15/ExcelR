class Area{
    //fields to calculate area

    int length;
    int breadth;
    //constructor to initialize the value
    // Area(int length, int breadth){
    //     this.length = length;
    //     this.breadth = breadth;
    // }

    //method to calculate area

    public void getArea(int length, int breadth){
        int area = length*breadth;
        System.out.println("Area : "+area);
    }
}

public abstract class Main {
    public static void main(String[] args){

        // Area rect = new Area(5,6);

        Area rect = new Area();
        rect.getArea(5,6);
    }
}
