//import java.util.Random; - тут подклюбчить библитеку для рандомных значений


public class Personin {
    private String Name;
    private String surname;
    private int id;
    private int age;

    public Personin() {
//        Random random = new Random();
//        String[] names = {"Max", "Alex", "Mykola", "Dmitrii", "Viktor"};
//        String[] surnames = {"Dovgan", "Smolnii", "Babchuk", "Mihienko", "Kovalchyk"};
//        this.Name = names[random.nextInt(names.length)];- тут оно будет брать значение с массива
//        this.surname = surnames[random.nextInt(surnames.length)];- и тут
//        this.id = random.nextInt(999999);
//        this.age = random.nextInt(60); - тут будет вибирать рандомное значение от 0 до 60

    }

    public Personin(String name, String surname, int id, int age) {
        super();
        this.Name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name != null)
        this.Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null)
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
        this.age = age;
    }

    @Override
    public String toString() {
        String str = "name:" + this.Name + " surname: " + this.surname + " id: " + this.id + " age: " + this.age;

        return str;
    }
}
