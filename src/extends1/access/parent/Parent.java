package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() { // 3️⃣ 메서드를 실행한다.
        System.out.println("Parent.publicMethod");
    }

    protected void protectMethod() { // 3️⃣ 메서드를 실행한다. (protected 여서 상속관계인 다른 패키지인 Child 에서 요청이 가능하다)
        System.out.println("Parent.protectMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() { // 4️⃣ 실행한다.
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectValue = " + protectValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = "+ privateValue);

        defaultMethod(); // 5️⃣ 실행한다. 같은 패키지에 있어서 가능
        privateMethod(); // 5️⃣ 실행한다. 현재 클래스에 있어서 가능
    }
}
