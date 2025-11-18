package second;

public class Cats implements Comparable<Cats> {
    private String name;
    private int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cats second) {
        return Integer.compare(this.age, second.age);
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", age=" + age + '}';
    }
}
