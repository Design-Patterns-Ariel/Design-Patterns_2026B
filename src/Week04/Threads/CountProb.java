package Week04.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class CountProb {


    static AtomicInteger COUNT = new AtomicInteger(0);

    static void main() {
        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    COUNT.incrementAndGet();
//                    System.out.println(COUNT);
                }

            }
        };
        Runnable runnable2 = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    COUNT.decrementAndGet();
//                    System.out.println(COUNT);
                }
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(COUNT);


    }



}
