package extends1.super1;

public class SuperMain {

    public static void main(String[] args) {
        Child child = new Child(); // 기본 생성자는 default로 접근제어자가 설정된다. child는 클래스 앞에 접근제한자가 없다 = default
        child.call();

    }
}
