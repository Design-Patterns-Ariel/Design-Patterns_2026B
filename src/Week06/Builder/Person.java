package Week06.Builder;

public class Person {
    public Person() {
    }

    public Person(Person p) {
    }

    void func(){
        System.out.println(this);
    }
    public Person funcPerson(){
        return this;
    }
}
