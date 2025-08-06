package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }
}
