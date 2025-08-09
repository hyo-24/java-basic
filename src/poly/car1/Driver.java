package poly.car1;

public class Driver {

    private Car car; // 정보 가져오기 (정보는 Main 에서 전달해준다.)

    public void setCar(Car car) { // Car의 자식 중 하나를 실행
        System.out.println("자동차를 설정합니다: "+car);
        this.car = car; // driver 인스턴스에 정보 저장
    }

    public void drive() { // Car에 들어있는 차량을 실행하는 코드
        System.out.println("자동차를 운전합니다.");
        car.startEngine(); // car 변수에 들어있는 차량 인스턴스의 메서드를 실행
        car.pressAccelerator();
        car.offEngine();
    }
}
