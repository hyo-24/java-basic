package extends1.super1;

public class Child extends Parent{ // 현재 자식 클래스에 있고 부모 클래스를 상속한다! 클래스에 접근제한자가 없다! default로 자동 설정!
    public String value = "child";

    @Override
    public void hello() { // 부모 클래스에도 같은 이름의 오버라이딩된 메서드가 있다. super 안하면 이게 실행된다.
        System.out.println("Child.hello");

    }

    public void call() {
        System.out.println("this value = "+ this.value);
        System.out.println("super value = "+ super.value); // 여기서는 부모의 메서드를 쓰고싶은데 항상 자식이 먼저 선택되서 super로 바로 부모클래스로 간다.

        this.hello();
        super.hello();
    }
}
