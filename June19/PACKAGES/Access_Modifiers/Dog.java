class Animal{
    //protected method
    protected void display(){
        System.out.println("I am a animal");
    }
}


class Dog extends Animal{
    public static void main(String[] args){
        Dog D = new Dog();
        D.display();
    }
}



