package Week04.Exceptions;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        ArithmeticException e = new ArithmeticException();
        int a, b;
        a = 6;
        b = 6;
//        double res = func(a, b);
//        System.out.println(res);
        try {
            double res = func(a, b);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Hello finally");
        }
        System.out.println("---------------------END----------------------------");

        
    }



    private static double func(int a, int b) throws ArithmeticException {
        if (a == 0)
            throw new ArithmeticException("Hello error from ->  private static double func(int a, int b) ");
        return b / a;

    }
}
