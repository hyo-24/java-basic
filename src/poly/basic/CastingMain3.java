package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = (Parent) child; // 업캐스팅! 이건 생략 가능하다. 부모는 자식을 담을 수 있으니까!
        Parent parent1 = child;

        parent.parentMethod();
        // parent.childMethod(); // 뭐야 parent 안에 자식 인스턴스 있는데? -> ❌ 찾아가는 단계, 컴파일 단계에서는 변수타입만 알 수 있음!! 부모에는 자식 정보 없다.
        parent.parentMethod(); // 당연히 가능
        parent1.parentMethod();
    }
}
