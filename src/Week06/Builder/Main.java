package Week06.Builder;

public class Main {

    static void main() {
        // p 0xff
        Person p = new Person();
        p.func();
        Person p1 = p.funcPerson();

        System.out.println(p == p1);
        p.funcPerson().funcPerson().funcPerson().funcPerson();

        Builder builder = new Builder.BuilderExample().setA1(1).setA5(7).build();
    }
}
