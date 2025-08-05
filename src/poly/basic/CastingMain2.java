package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {

        Parent poly = new Child();
        // poly.childMethod(); 컴파일 단계에서는 변수타입의 클래스에서만 확인하도록 제한해둠! (다른 타입을 변수에 넣고 다른 메서드를 호출하면 런타임에러가 나기 때문)

        ((Child) poly).childMethod(); // 일시적 다운 캐스팅! 자식타입변수 선언 안하고도 자식 메서드 호출 가능!
    }
}
