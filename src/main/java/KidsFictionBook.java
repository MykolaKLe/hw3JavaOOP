public class KidsFictionBook extends FictionBook {

    private int age;

    public KidsFictionBook() {}

    public KidsFictionBook(String title, String author, int pages, int isbn, String genre, int age) {
        super(title, author, pages, isbn, genre);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0)
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " Age: " + this.age;
    }
}
