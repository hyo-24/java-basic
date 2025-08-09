package poly.ex.sender;

public interface Sender {

    /*void EmailSender();
    void SmsSender();
    void FaceBookSender();*/

    void sendMessage(String message); // 각 자식들이 쓸 메서드(그냥 형식)
}
