//import java.util.Random;


public class Employee extends Personin {
    private String profession;
    private double expirience;
    private double salary;
    private String department;
    private String position;
    private String degree;

    public Employee(){
//        Random rand = new Random();
//        String [] proffesions ={"Tester","DevOPS","Manager","Desiger","Support"};
//        String [] department = {"IT","Support","Sales","HR","Design"};
//        String [] degrees = {"master","bakalavr","specialist"};
//        String [] position = {"QA Tester","Java dev","HR","Team lead","Support eng","Manager"};
//
//        setProfession(proffesions[rand.nextInt(proffesions.length)]);
//        setDepartment(department[rand.nextInt(department.length)]);
//        setPosition(position[rand.nextInt(position.length)]);
//        setDegree(degrees[rand.nextInt(degrees.length)]);
//        setSalary(rand.nextDouble(99999));
//        setExpirience(rand.nextDouble(20));
    }

    public Employee(String profession, double expirience, double salary, String department, String degree, String position) {
        super();
        setProfession(profession);
        setSalary(salary);
        setDepartment(department);
        setPosition(position);
        setExpirience(expirience);
        setDegree(degree);
    }// от тут я довго не думав чого не брало те що в сетерах а потім зрозумів що робив все через this і тому логіка не працювала.
    // this.profession = profession;
    //this.expirience = expirience;
    //this.salary = salary;
    //this.department = department;
    //this.degree = degree;
    //this.position = position;


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        if (profession != null)
        this.profession = profession;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        if (expirience >= 10&& expirience <= 20){
            this.expirience = expirience;
            this.salary = this.salary * 2.5;}
        else{
            if(expirience >= 5 && expirience <= 9.9){
                this.expirience = expirience;
                this.salary = this.salary * 2;
            }
            else if(expirience >= 0 && expirience <= 4.9){
                this.expirience = expirience;
                this.salary = this.salary * 1.5;
            }
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0)
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null)
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null)
        this.position = position;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if (degree != null && degree.equals("master")) {
            this.degree = degree;
            this.salary = this.salary + 700;
        } else if (degree != null && degree.equals("bakalavr")) {
            this.degree = degree;
            this.salary = this.salary + 450;
        } else if (degree != null && degree.equals("specialist")) {
            this.salary = this.salary + 250;
            this.degree = degree;
        }
    }

    @Override
    public String toString() {
        String str = "profession: " + this.profession + " expirience: " + this.expirience + " salary: " + this.salary + " department: " + this.department + " position: " + this.position + " degree: " + this.degree;
        return str;
    }
}
