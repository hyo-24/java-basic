package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow()}; // 부모타입배열에 자식들 인스턴스 생성하고 저장

        for (Animal animal : animalArr) { // 메서드 호출을 반복문으로 해결
            animalSound(animal);
        }

    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
