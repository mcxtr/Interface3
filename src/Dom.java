public class Dom implements Family {
    private String Name;
    private int age;
    private String lastName;

    public Dom() {
        System.out.println("Family");
    }

    @Override
    public String toString() {
        return "Dom" +
                "Name" + Name + "\n" +
                " age" + age +
                " lastName" ;
    }

    public Dom(String name, int age, String lastName) {
        Name = name;
        this.age = age;
        this.lastName = lastName;
    }
}

