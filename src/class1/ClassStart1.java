package class1;

public class ClassStart1 {
    public static void main(String[] args) { // 배열에 집어넣고 메서드로 출력
        String[] studentName = new String[]{"김경식", "나해수"};
        int[][] impormation = new int[][]{
                {15, 90},
                {16, 80}
        };

        System.out.println("이름: "+studentName[0]+" 나이: "+impormation[0][0]+" 성적: "+impormation[0][1]);
        System.out.println("이름: "+studentName[1]+" 나이: "+impormation[1][0]+" 성적: "+impormation[1][1]);

    }
}
