package extends1.ex;

public class Movie extends Item{
    private String director; // 여기서만 director, actor 초기화를 할 수 있게함. 여러번 재사용할거라 final은 아님.
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price); // 메인 클래스에서 받은 매개변수를 super(); 상위클래스의 생성자로 보낸다는 뜻 | 나는 이 값을 처리할 때 따로 해야한다고 착각해서 super을 두개 입력했다.
        this.director = director; // 생성자 안에서 여러개의 필드 초기화가 가능하다는 거 기억하자
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: "+director+", 배우: "+actor); // 상위 클래스에서 공통된거 출력하면 여기서 추가로 출력해서 결국 같이 출력된 것 처럼 보임.
    }
}
