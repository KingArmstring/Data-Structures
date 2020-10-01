public class Person implements Comparable<Person>{

    String name;
    int age;
    double length;

    public Person(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) return 1;
        if (this.age < o.age) return -1;
        else return 0;
    }

}
