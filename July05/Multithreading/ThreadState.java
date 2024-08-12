//Abc class implements interface Runnable
class ABC implements Runnable {
    public void run() {
        // moving thread to times waiting state
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked join() on thread t2- " + ThreadState.t1.getState());

        try {
            Thread.sleep(200);

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of thread t1 is: " + t1.getState());

        // invoke stART() ON T1 THREAD
        t1.start();
        System.out.println("The state of t1 thread fter invoking start( method )" + t1.getState());
    }

    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        // Thread t2 created and currently in new state
        System.out.println("The state of thread t2 is " + t2.getState());

        // invoking thread t2 with strt()
        t2.start();

        try {
            Thread.sleep(200);
        } 
        catch (InterruptedException ie){
            ie.printStackTrace();

        }
        System.out.println("the state of thread t2 after invoking sleep() " + t2.getState());

        try{
            // waiting for thread t2 to complete its exution
            t2.join();
        } 
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The state ofthread t2 when it has completed its execution " + t2.getState());
    }
}