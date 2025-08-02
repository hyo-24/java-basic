package extends1.super2;

public class ClassB extends ClassA{ // 여기에 생성자르 오버로딩해서 2개가 있다.

    public ClassB(int a) {
        super();
        System.out.println("ClassB 생성자 a = "+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = "+a+" b = "+b);
    }
}
