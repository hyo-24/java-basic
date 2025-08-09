package poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()}; // 인스턴스 생성, 배열에 대입

        for (Sender sender : senders) { // 각 자식의 메서드가 처리할 값을 전달
            sender.sendMessage("환영합니다!");
        }

    }
}
