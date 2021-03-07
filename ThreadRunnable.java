class MyThread implements Runnable{
    public void run(){
        System.out.println("run() started");
        for(int i=1;i<=10;i++)
        System.out.println("The Value is: "+i);
        System.out.println("run() ended");
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1);
        t1.start();
        System.out.println("Main Thread Ended");
    }
}
