package library;

/**
 * @author
 */
public class Book {
    private int index;

    private String name;

    private String author;

    private double price;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(int index, String name, String author) {
        this.index = index;
        this.name = name;
        this.author = author;
    }

    public Book() {
    }
}
