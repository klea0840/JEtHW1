package Boolk;

public class Content {

    String content;

    public Content() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    void show () {
        System.out.println("The content: " + content);
    }
}
