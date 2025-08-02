package extends1.ex;

public class Item {

    private String name; // 여기에 final 하면 안되나...? private을 안넣음
    private int price;

     public Item(String name, int price) { // price 입력은 제대로 했는데 매개변수 사이에 , 를 안해서 오류가 남
        this.name = name;
        this.price = price; // 앞에서 super(name, price); 요청하면 이 생성자가 실행된다.
    }

    public int getPrice() { // 메서드임. 모든 상품가격의 합을 구할 때
         return price;
    }

    public void print() { // super.print(); 하면 이게 실행된다.
        System.out.println("이름: "+name+", 가격: "+price);
    }


}
