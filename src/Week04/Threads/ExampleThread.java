package Week04.Threads;
public class ExampleThread {
    static void main() {
        ThreadTest threadTest = new ThreadTest();
        Thread t = new Thread(threadTest);
        t.start();
        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                while (true){
                    System.out.println("Hello Runnable runnable1");
                }
            }
        };
        Runnable runnable2 = new Runnable(){
            @Override
            public void run() {
                while (true){
                    System.out.println("------------------------ Hello Runnable runnable2 --------------------");
                }
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();

        ThreadExtendsThread tet = new ThreadExtendsThread();
        tet.start();

        while(true){
            System.out.println("Hello static void main()");
        }
    }
}
class ThreadTest implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello class ThreadTest implements Runnable");
        }
    }
}


class ThreadExtendsThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello class ThreadTest implements Runnable");
        }
    }
}
