package chatGPT;



public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("자바의 정석","남궁성",35000);

        book.printInfo(); // 여기에 매개변수가 없으면 클래스의 메서드에도 없어야 된다! 어차피 필드에서 값 가져옴
    }
}
