package chatGPT;

public class Student {
    String name;
    int age;
    static int count; // static을 붙여야 한다! static은 객체가 아니라 클래스 전체에서 공유되는 변수다.


    Student(String name, int age) {
       this.name = name;
       this.age = age;
       this.count = count++;
    }


}
