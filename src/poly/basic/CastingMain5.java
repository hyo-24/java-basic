package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child(); // parent2는 자식과 부모 영역을 다 가지고 있는 인스턴스다.
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent; // 부모타입변수에서는 자식의 메서드를 부를 수 없다. 그래서 다운캐스팅 했음.
            child.childMethod(); // 자식타입에서 자식 메서드 요청
        }
    }
}
