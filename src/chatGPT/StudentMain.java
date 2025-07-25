package chatGPT;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("이효주",18);

        Student student2 = new Student("범태하",18);

        Student student3 = new Student("나해수",18);


        System.out.println("총 학생 수: "+Student.count); // Student.count 클래스이름으로 접근 | student1.count 객체이름으로 접근




    }
}
