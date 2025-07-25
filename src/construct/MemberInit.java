package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void create(String name, int age, int grade) {
        this.name = name; // 여기서 this를 붙여야 우선순위인 매개변수 name이 아니라 인스턴스 필드의 name으로 대입이 된다!
        this.age = age;
        this.grade = grade;
    }
}
