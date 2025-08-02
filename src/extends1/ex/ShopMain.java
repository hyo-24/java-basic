package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie  = new Movie("영화1", 18000, "감독1", "배우1");

        book.print(); // 공통되지 않은 부분을 출력하는 메서드! 이 안에 상위클래스에 있는 공통된 필드의 출력메서드를 요청하는게 들어있다.
        album.print();
        movie.print();

        int sum = book.getPrice()+album.getPrice()+movie.getPrice(); // 여기서 Item에 있는 메서드를 각각 호출. "book 인스턴스의 price 값" 을 뜻하는 건가?
        System.out.println("상품 가격의 합: "+ sum);
    }
}
