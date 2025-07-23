package ref;


public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 이때 class1패키지에 있는 Student를 클릭하면 오류가 남. ref꺼를 엔터해야한다.
        result(student1, "학생1", 16, 80);

        Student student2 = new Student(); // 만약 본인 패키지에서 가져오는게 아니면 위에 import class1 ~ 이런 식으로 뜬다.
        result(student2, "학생2", 15, 90);

        print(student1);
        print(student2);
    }

    static void result(Student student, String name, int age, int grade) {
       student.name = name;
       student.age = age;
       student.grade = grade;

    }

    static void print(Student student1) { // 여기서 student1은 이름일 뿐이다! 저 위에랑 다르다!
        System.out.println("이름: "+student1.name+", 나이: "+student1.age+", 성적: "+student1.grade);
    }
}
