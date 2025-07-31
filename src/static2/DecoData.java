package static2;

public class DecoData {

    private int instanceValue; // 객체 생성시 사용가능한 멤버변수
    private static  int staticValue; // 객체 생성 없이 클래스에서 유지되는 멤버변수

    public static void staticCall() { // static 이라서 이 클래스의 인스턴스 생성 없이 끌어다 사용할 수 있는 메서드
        staticValue++;
        staticMethod(); // staticValue에 증감하고 메서드를 호출해 실행! 여기서 static 메서드라서 static 메서드,멤버변수만 호출 할 수 있다.
    }

    public void instanceCall() { // 이 클래스의 인스턴스를 생성해야 사용할 수 있는 메서드
        instanceValue++; // 클래스의 멤버변수
        instanceMethod();

        staticValue++; // 인스턴스의 멤버변수
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() { // 인스턴스 생성 없이 사용 가능한 메서드
        System.out.println("staticValue = "+staticValue);
    }
}
