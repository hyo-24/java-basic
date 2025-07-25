package oop1.ex;

public class Rectangle {

    /*int width = 5;
    int height = 8;
    int area = width * height;

    // 객체 생성 메서드를 만들었었음....

    void calculateArea(int area) { // 넓이 구하는 메서드
        System.out.println("넓이: "+area);
    }

    void perimeter(int width, int height) { // 둘레 구하는 메서드
        int perimeter = width*2 + height*2;
        System.out.println("둘레: "+perimeter);
    }

    void justify(int width, int height) {
       boolean square = false;
        if (width == height) {
            square = true;
            System.out.println("정사각형 여부: " + square);
        } else {
            System.out.println("정사각형 여부: "+ square);
        }

    }*/

    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }
}
