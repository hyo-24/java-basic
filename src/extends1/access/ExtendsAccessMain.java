package extends1.access;

import extends1.access.child.Child; // 패키지 안의 패키지 안의 패키지의 클래스를 참조할거야.

public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child(); // 인스턴스 생성
        child.call(); // 인스턴스의 참조값을 통해서 child 클래스의 call 메서드를 요청한다! (인스턴스를 생성해야 요청가능한 메서드! 생성 안하려면 static)
    }
} // 실행 결과를 보면 실행을 요청한 순서대로 출력이 된걸 볼 수 있다. 큐 방식으로 스택 영역이 생성된듯.
