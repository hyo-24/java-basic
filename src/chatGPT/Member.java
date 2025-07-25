package chatGPT;

public class Member {
    String name;
    String id;
    int age;
    static int num;
    int numbers;

    Member(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        num++; // int num = num++; 은 후위증감이라서 값이 대입되고 증가한 값은 버려진다.
        this.numbers = num; // 각 객체가 본인의 회원번호를 가짐 (증가하고 각각 부여)
    }

    Member(String name, String id) {
        this(name,id,20);
    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 "+name+"이고 아이디는 "+id+", 회원번호는 "+numbers+"입니다.");
    }
}
