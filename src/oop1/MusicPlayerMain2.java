package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayer = new MusicPlayerData(); // 클래스를 이용해서 필드를 만들어 사용한 코드
        // 앞에서 직접 변수에 값을 대입하는 코드랑 비교했을 때 musicPlayer라는 객체에 필드들을 바로 알아볼 수 있다는 점?
        // 객체가 더 만들어져도 어떤 객체의 필드인지를 한 눈에 알아볼 수 있다는 정도의 장점이 있다. 하지만 여전히 비효율적이다.

        musicPlayer.isOn = true;
        System.out.println("음악플레이어를 시작합니다.");

        musicPlayer.volume++;
        System.out.println("음악 플레이어 볼륨: "+musicPlayer.volume);

        musicPlayer.volume++;
        System.out.println("음악 플레이어 볼륨: "+musicPlayer.volume);

        musicPlayer.volume--;
        System.out.println("음악 플레이어 볼륨: "+musicPlayer.volume);

        if (musicPlayer.isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + musicPlayer.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        musicPlayer.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
