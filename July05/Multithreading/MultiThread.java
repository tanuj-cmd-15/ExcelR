class MultithreadingDemo extends Thread{
    public void run(){
        try{
            //Displaying threaf that is running in
            System.out.println("Thread "+Thread.currentThread().getId()+" id running");
        }catch(Exception e){
            //threading an aexception
            System.out.println("Exception is caught");
        }
    }

}

public class MultiThread{
    public static void main(String[] args){

        int n = 8;
        for(int i =0;i<n;i++){
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}