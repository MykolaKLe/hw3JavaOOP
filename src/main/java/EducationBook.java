public class EducationBook extends Book{
    private String subject;

    public EducationBook(){}

    public EducationBook(String title, String author, int pages, int isbn, String subject) {
        super(title, author, pages, isbn);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject != null)
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " EducationBook: " + subject;
    }
}
