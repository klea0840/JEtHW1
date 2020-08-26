package Boolk;

public class Book {

    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthor("Gemmel");
        author.show();

        Title title = new Title();
        title.setTitle("The Midnight Falcon");
        title.show();

        Content content = new Content();
        content.setContent("Fantasy");
        content.show();

    }


}
