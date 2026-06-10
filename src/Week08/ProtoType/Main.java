package Week08.ProtoType;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static void main() throws CloneNotSupportedException {
        A a = new A();
        A ab = new B();
        A ac = new C();
        A ad = new D();

        A[] arr = new A[10];

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(0, 4)) {

                case 0:
                    arr[i] = new A();
                    break;
                case 1:
                    arr[i] = new B();
                    break;
                case 2:
                    arr[i] = new C();
                    break;
                case 3:
                    arr[i] = new D();
                    break;
                default:
                    arr[i] = new A();
                    break;

            }
        }

        A copy = arr[7];
        int i = new Random().nextInt(10);
        copy= arr[i].copy();
        copy= (A) arr[i].clone();

        Object[] objects = new Object[10];

        if (arr[5] instanceof A)
            copy = new A(arr[5]);
        else if (arr[5] instanceof B) {
            copy = new B((B) arr[5]);
        } else if (arr[5] instanceof C) {
            copy = new C((C) arr[5]);
        } else if (arr[5] instanceof D) {
            copy = new D((D) arr[5]);
        }

    }

}

class A implements Cloneable {

    int a;
    ArrayList<Integer> al;

    public A() {
        this.a = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new A(this);
    }

    public A copy(){
        return new A(this);
    }

    public A(A other) {
        this.a = other.a;
        this.al = new ArrayList();
        for (int i = 0; i < other.al.size(); i++) {
            this.al.add(other.al.get(i));
        }

    }

}

class B extends A {


    int b;
    public B copy(){
        return new B(this);
    }
    public B() {

    }


    public B(B other) {
        super(other);
        this.b = other.b;
    }
}

class C extends B {
    int c;

    public C() {
    }
    public C copy(){
        return new C(this);
    }
    public C(C other) {
        super(other);
        this.c = other.c;
    }
}

class D extends C {
    int d;

    public D() {
    }
    public D copy(){
        return new D(this);
    }
    public D(D other) {
        super(other);
        this.d = other.d;
    }
}
