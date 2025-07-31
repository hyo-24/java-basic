package static2.ex;

public class Car {
    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: "+name);
        count++;
    }

    public static void showTotalCars() { // 안에 매개변수가 없어도 count는 static 이라서 공용이고 메서드가 static 이라서 가져올 수 있다.
        System.out.println("구매한 차량 수: "+count);
    }
}
