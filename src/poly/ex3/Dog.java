package poly.ex3;

public class Dog extends AbstractAnimal { // 밑에 추상메서드를 다 오버라이딩 해야 컴파일 오류가 사라짐

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
