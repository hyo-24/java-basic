package static2.ex;

import static static2.ex.MathArrayUtils.*; // 앞에 static을 붙여야 함! 패키지 이름이랑 헷갈리지마

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum = "+ sum(values));
        System.out.println("average = "+ average(values));
        System.out.println("min = "+ min(values));
        System.out.println("max = "+ max(values));
    }
}
