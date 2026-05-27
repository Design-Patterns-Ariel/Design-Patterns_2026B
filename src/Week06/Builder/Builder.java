package Week06.Builder;

public class Builder {

    private int a1;
    private int a2;
    private int a3;
    private int a4;
    private int a5;
    private int a6;
    private int a7;
    private int a8;

    private int[] arr;
    private Person[] people;

    public Builder(BuilderExample other) {
        this.a1 = other.a1;
        this.a2 = other.a2;
        this.a3 = other.a3;
        this.a4 = other.a4;
        this.a5 = other.a5;
        this.a6 = other.a6;
        this.a7 = other.a7;
        this.a8 = other.a8;
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = other.arr[i];
        }
        this.people = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            this.people[i] = new Person(other.people[i]);
        }

    }

    static class BuilderExample {

        private int a1;
        private int a2;
        private int a3;
        private int a4;
        private int a5;
        private int a6;
        private int a7;
        private int a8;

        private int[] arr;
        private Person[] people;

        public BuilderExample() {
        }

        public BuilderExample(int a1, int a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        public BuilderExample setA1(int a1) {
            this.a1 = a1;
            return this;
        }

        public BuilderExample setA2(int a2) {
            this.a2 = a2;
            return this;
        }

        public BuilderExample setA3(int a3) {
            this.a3 = a3;
            return this;
        }

        public BuilderExample setA4(int a4) {
            this.a4 = a4;
            return this;
        }

        public BuilderExample setA5(int a5) {
            this.a5 = a5;
            return this;
        }

        public BuilderExample setA6(int a6) {
            this.a6 = a6;
            return this;
        }

        public BuilderExample setA7(int a7) {
            this.a7 = a7;
            return this;
        }

        public BuilderExample setA8(int a8) {
            this.a8 = a8;
            return this;
        }

        public BuilderExample setArr(int[] arr) {
            this.arr = arr;
            return this;
        }

        public BuilderExample setPeople(Person[] people) {
            this.people = people;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }


}
