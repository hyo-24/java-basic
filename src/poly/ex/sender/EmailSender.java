package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다: "+message);
    }



    /*private Sender message;

    public void sendMessage(Sender message) { // 부모가 각 자식이 오버라이딩 할 추상메서드를 생성한다.
        this.message = message;
    }

    @Override
    public void EmailSender() {
        System.out.println("메일을 발송합니다: "+ message);
    }

    @Override
    public void SmsSender() {
        System.out.println("SMS를 발송합니다: "+message); // 이거는 본인 클래스에!!
    }

    @Override
    public void FaceBookSender() { // 본인 클래스에!!!!
        System.out.println("페이스북에 발송합니다: "+message);
    }*/
}
