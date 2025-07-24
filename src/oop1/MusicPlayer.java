package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean onoff = false;

    void on() {
        onoff = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        onoff = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: "+volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: "+volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (onoff == true) {
            System.out.println("음악 플레이어 ON, 볼륨: "+volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
