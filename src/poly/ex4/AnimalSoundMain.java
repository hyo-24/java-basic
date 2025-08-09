package poly.ex4;


public class AnimalSoundMain {
    public static void main(String[] args) {

        InterfaceAnimal animal1 = new Cat();
        InterfaceAnimal animal2 = new Cow();
        InterfaceAnimal animal = new Dog();

        print(animal);
        print(animal1);
        print(animal2);

       move(animal);
       move(animal1);
       move(animal2);


    }

    public static void print(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void move(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
