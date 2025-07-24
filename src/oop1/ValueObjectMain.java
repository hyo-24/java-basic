package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject object = new ValueObject();

        object.add();
        object.add();
        object.add();

        System.out.println("최종 숫자 = "+object.value);

    }
}
