package ref;

public class MethodeChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = "+ a);
    }

    public static void changePrimitive(int x) { // 메서드의 경우 호출할 때 메서드에 값을 복사해서 준다.
        x = 20; // 메서드에서 코드를 실행한 값을 return하지 않으면! 그 값은 버려지고 main에서 지정된 값으로 출력이 된다!
    }
}
