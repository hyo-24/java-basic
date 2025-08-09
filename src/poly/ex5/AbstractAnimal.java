package poly.ex5;

public abstract class AbstractAnimal {
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다."); // 쓰이지는 않지만 오버라이딩 해야해서 생성, 인스턴스 생성 불가
    }
}
