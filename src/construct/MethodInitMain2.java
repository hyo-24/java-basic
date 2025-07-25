package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();

        member1.create("user1",15,90);

        MemberInit member2 = new MemberInit();
        member2.create("user2",16,80);
        // create(MemberInit member2,"user2",16,80); 필드 값을 메서드로 진행하는게 같은 클래스에 있으면 이렇게 해야 한다.

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: "+s.name+", 나이: "+s.age+", 성적: "+s.grade);
        }
    }

}
