package chatGPT;

public class MemberMain {
    public static void main(String[] args) {

        Member member1 = new Member("쿠베라", "Ananta15", 23);
        Member member2 = new Member("아그니", "FireLove");
        Member member3 = new Member("유타", "WaterFlower", 0);

        Member[] members = {member1,member2,member3};

        for (int i = 0; i < members.length; i++) {
            // introduce(members[i]); => introduce는 인스턴스 함수이기 때문에 members[i].introduce(); 로 해야한다.
            // 배열 요소가 객체 그 자체 다!!!
            members[i].introduce();
        }

        System.out.println("총 회원 수는 "+Member.num+"명 입니다.");



    }
}
