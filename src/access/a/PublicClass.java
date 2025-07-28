package access.a;

public class PublicClass { // 클래스 하나
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 객체 생성 ( 클래스이름 객체이름 = new 클래스이름 (); ) 이때 앞에는 클래스가 다른 파일에 있었지만 지금은 같은 파일에 있을 뿐이다.
        DefaultClass1 class1 = new DefaultClass1(); // 밑에 클래스를 만드니까 오류가 사라짐
        DefaultClass2 class2 = new DefaultClass2();

    }
}

class DefaultClass1 { // 클래스 둘

}

class DefaultClass2 { // 클래스 셋

}
