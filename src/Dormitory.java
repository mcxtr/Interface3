public class Dormitory implements Family{
    private String Name;
    private int age;
    private String lastName;

    @Override
    public String toString() {
        return "Dormitory" +
                "Name" + Name + "\n" +
                " age" + age +
                " lastName" + lastName;
    }

    public Dormitory() {
        System.out.println("Family2");
    }

    public Dormitory(String name, int age, String lastName) {
        Name = name;
        this.age = age;
        this.lastName = lastName;
    }
}
