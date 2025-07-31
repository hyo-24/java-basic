package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value); // 인스턴스의 필드값 출력
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value); // 인스턴스 멤버변수라서 객체 생성 후 필드값 사용 가능
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE); // static 멤버변수라서 객체생성 안해도 됨
    }
}
