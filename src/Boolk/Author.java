package Boolk;

public class Author {

    String author;

    public Author() {
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void show () {
        System.out.println("The author: " + author);
    }
}
