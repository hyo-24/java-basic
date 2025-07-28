package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public이라서 가능
        DefaultClass1 class1 = new DefaultClass1(); // default는 같은 패키지라서 접근이 가능. 여기가 메인이고 그 클래스 타입의 객체를 생성한거임
        DefaultClass2 class2 = new DefaultClass2();
    }
}
