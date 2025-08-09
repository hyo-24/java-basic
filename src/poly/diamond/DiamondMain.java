package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {

        InterfaceA a = new Child(); // 인터페이스는 인스턴스 생성이 안된다!! 자식클래스로 생성하고 그 안에 인터페이스의 메서드를 오버라이딩 했다.
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
