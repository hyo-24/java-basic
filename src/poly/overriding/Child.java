package poly.overriding;

public class Child extends Parent{

    public String value = "child"; // 필드는 보통 private 으로 한다길래 했더니 메인에서 value 값이 오류남.

    @Override
    public void method() { // value 가 여기 메서드 안에서 쓰는게 아니고 메인에서 가져와서 하는 거니까 public 으로 해야함.
        System.out.println("Child.method");
    }
}
