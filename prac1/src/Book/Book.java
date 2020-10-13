package Book;

public class Book {
    private String name;
    private int pages;
    private String author;

    public Book(String n, int a, String s) {
        name = n;
        pages = a;
        author = s;
    }

    public Book(String n, String s) {
        name = n;
        pages = 0;
        author = s;
    }

    public Book() {
        name = "Gazeta";
        pages = 0;
        author = "Man";
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return this.name + " book wrote by " + this.author;
    }

    public void countPages() {
        System.out.println(name + " book has " + pages);
    }
}
