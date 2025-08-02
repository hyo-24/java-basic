package extends1.overriding;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override // 밑에 메서드가 부모 클래스의 메서드와 같아야지 오버라이딩 할 수 있다.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
