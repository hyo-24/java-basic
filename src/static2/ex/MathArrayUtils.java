package static2.ex;

public class MathArrayUtils {
    private static int total;


    public static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double average(int[] array) {
        /*int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (double) total / array.length;*/
        return (double) sum(array) / array.length; // 내부의 메서드를 가져와서 사용!!! 매개변수를 int[i] array로 해서 틀림 배열이라는 걸 넣어야 하는줄
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
