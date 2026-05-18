public class Person {
    //this - link to all in class
    //fields
    private String name;
    private int id;
    private double age;

    //Default constructor
    public Person() {
        System.out.println("Default Constructor");
    }


    //setters
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public void setAge(double age) {
        if (age > 0)
            this.age = age;
    }

    //getters - должны занести в переменную
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAge() {
        return age;
    }
}
