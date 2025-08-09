package poly.ex5;

public class SoundFlyMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) { // Fly는 인터페이스라서 다중구현이 가능하다. 그래서 자식들이 추상클래스와 인터페이스 둘다 상속할 수 있다.
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
