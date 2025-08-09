package poly.ex4;

import poly.ex3.AbstractAnimal;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("먀옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
