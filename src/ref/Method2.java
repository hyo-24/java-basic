package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = inputStudent("학생1",15,90);
        Student student2 = inputStudent("학생2",16,80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student inputStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 객체 생성을 메서드 안에서 했으니까 main 메서드 안에 참조값을 반환 해줘야 객체가 값을 가짐
    }

    static void printStudent(Student student) { // 메서드 매개변수는 꼭 변수타입이 필요함
        System.out.println("이름: "+student.name+", 나이: "+student.age+", 성적: "+student.grade);
    }
}
