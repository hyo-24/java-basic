package chatGPT;

public class Calculator {
    //int a; -> 객체 생성 안하고 클래스만 만들어서 메서드 쓰는거임! 대상의 여러 종류의 성질
    //int b;


    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static int divide(int a, int b) {
        int result = a / b;
        return result;
    }
}
