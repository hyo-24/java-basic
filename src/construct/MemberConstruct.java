package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) { // 이 부분이 생성자! 메서드와 비슷하지만 다르다
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
