public class Book {/* extends Object */
    private String title;
    private String author;
    private int pages;
    private int isbn;

    public Book(String title, String author, int pages, int isbn) {
        super();//наследования
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        if (title != null)
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null)
        this.author = author;

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
       if (isbn > 0)
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0)
        this.pages = pages;
    }

    @Override
    public String toString() {
        String str = "Author: " + this.author +
                "Title: " + this.title +
                "Pages: " + this.pages +
                "ISBN: " + this.isbn;
        return str;
    }
}
