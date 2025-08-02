package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
        // Item(name);
        // Item(price);
    }

    @Override
    public void print() {
        super.print(); // 상위 클래스의 print 메서드를 생성한다.
        System.out.println("- 저자: "+author+", isbn: "+isbn);
    }


}
