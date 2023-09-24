public class Hotel implements Family {
    private String Name;
    private int age;
    private String lastName;

    @Override
    public String toString() {
        return "Hotel" +
                "Name=" + Name + "\n" +
                " age" + age +
                " lastName" + lastName ;
    }

    public Hotel() {
        System.out.println("Family3");
    }

    public Hotel(String name, int age, String lastName) {
        Name = name;
        this.age = age;
        this.lastName = lastName;
    }
}
