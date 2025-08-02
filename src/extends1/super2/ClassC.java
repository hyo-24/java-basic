package extends1.super2;

public class ClassC extends ClassB { // 그냥 상속 설정만 하면 오류가 뜬다.

    public ClassC() {
        super(10, 20); // 이렇게 생성자 호출을 해야지 오류가 사라진다.
        System.out.println("ClassC 생성자");
    }
}
