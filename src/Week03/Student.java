package Week03;

public class Student implements Comparable<Student> {

    private String name;
    private String id;
    private int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Student getSt(){
        return this;
    }

    @Override
    public int compareTo(Student o) {
//        if (this.age == o.age) {
//            return 0;
//        }
//        else if (this.age>o.age) {
//            return 1;
//        }
//        else return -1;
        return o.age - this.age;
    }
}
