package singleton1;
public class Final {

    public static void main(String[] args) {
        // Create two threads t1 and t2
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dekhi obj1 = Dekhi.getInstance();
              //  System.out.println("Thread 1: " + obj1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dekhi obj2 = Dekhi.getInstance();
                //System.out.println("Thread 2: " + obj2);
            }
        });

        // Start the threads
        t1.start();
        t2.start();
    }
}
