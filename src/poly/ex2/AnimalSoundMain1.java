package poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {

        Animal animal = new Dog();
        Animal animal1 = new Cat();
        Animal animal2 = new Cow();

        soundAnimal(animal);
        soundAnimal(animal1);
        soundAnimal(animal2);

    }

    private static void soundAnimal(Animal animal) { // static 은 그 클래스의 인스턴스를 생성 안해도 사용할 수 있다는 뜻
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
