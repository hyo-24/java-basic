package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        isOn(data);
        volumeup(data);
        volumeup(data);
        volumedown(data);
        statement(data);
        turndown(data);

    }

    static void isOn(MusicPlayerData isOn) {
        isOn.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void volumeup(MusicPlayerData volume) {
        volume.volume++;
        System.out.println("음악 플레이어 볼륨: "+volume.volume);
    }

    static void volumedown(MusicPlayerData volume) {
        volume.volume--;
        System.out.println("음악 플레이어 볼륨: "+volume.volume);
    }

    static void statement(MusicPlayerData onoff) {
        if (onoff.isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: "+onoff.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    static void turndown(MusicPlayerData off) {
        off.isOn = false;
        System.out.println("프로그램을 종료합니다.");
    }
}
