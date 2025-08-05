package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+parent.value);
        parent.method();

        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+child.value);
        child.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+poly.value);
        poly.method();
    }
}
