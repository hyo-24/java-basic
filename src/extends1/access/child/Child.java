package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() { // 1️⃣ 메인 클래스에서 import를 통해 이 메서드를 요청한다.
        publicValue = 1;
        protectValue = 1;
        // defaultValue = 1; 같은 패키지여야만 한다
        // privateValue = 1; 그 클래스에서만 사용가능하다.

        publicMethod(); // 2️⃣ 자식이 부모의 메서드를 요청한다. 가능.
        protectMethod();
        // defaultMethod(); 위와 같은 이유로 안된다.
        // privateMethod();

        printParent();
    }
}
