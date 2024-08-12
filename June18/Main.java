class Polygon{
    int S = 8;
    int R = 5;
    //method to render a shape
    public void render(){
        System.out.println("rendering a polygon : ");
    }
}

class Square extends Polygon{

    //render square
    public void render() {
        System.out.println("rendering a square "+ S);
    }
}

class Circle extends Polygon{

    //render circle
    public void render() {
        System.out.println("rendering a circle "+R);
    }
}

public class Main{
    public static void main(String[] args){

        //create an obj of square
        Square s1 = new Square();
        s1.render();

        Circle c1 = new Circle();
        c1.render();
    }
}