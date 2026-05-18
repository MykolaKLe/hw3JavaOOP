public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();//Default constructor // object creation person(объект экземпляр класса)
        p1.setName("Mykola Kleishchov");
        p1.setId(1231);
        p1.setAge(28.1);
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Id: "+p1.getId());

        Person p2 = new Person();
        p2.setName("Anna Letycha");
        p2.setId(12312);
        p2.setAge(27.10);
        System.out.println("Name: "+p2.getName());
        System.out.println("Age: "+p2.getAge());
        System.out.println("Id: "+p2.getId());

    }
}
/*
p1.->[name= 'Mykola Kleishchov'  id=1231 age=28.1]
p2.->[name= 'Anna Letycha' id=12312 age=27.10]
 */


/*
HW
1.

Computer
company(string)
ram(int)
CPU(String)
SDD(int)
setter/getter

MainComputer -> main
create 3 object Computer
Use setters and getters for printing

1.      Computer
        _________

        company(String) "Lenovo"
        ram(int).        8 or 16
        cpu(String).     i5 or i9
        sdd(int).        500 Gb
        set/get

        MainComputer -> main
//        create 3 objects Computer
//        use setters and getters for printing
//2. Advance
for your choose
 */

