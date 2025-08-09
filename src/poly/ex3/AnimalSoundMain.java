package poly.ex3;

public class AnimalSoundMain {
    public static void main(String[] args) {

        AbstractAnimal animal = new Dog();
        AbstractAnimal animal1 = new Cat();
        AbstractAnimal animal2 = new Cow();

        print(animal);
        print(animal1);
        print(animal2);

       move(animal);
       move(animal1);
       move(animal2);


    }

    public static void print(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void move(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
