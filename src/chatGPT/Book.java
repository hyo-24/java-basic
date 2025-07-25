package chatGPT;

public class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        System.out.println("제목: "+title);
        System.out.println("저자: "+author);
        System.out.println("가격: "+price);
    }
}
