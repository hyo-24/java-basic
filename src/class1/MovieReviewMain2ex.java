package class1;

public class MovieReviewMain2ex {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2]; // 사용자 지정 타입(클래스)에 배열 지정

        MovieReview inception = new MovieReview(); // 객체 선언
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프"; // 속성 입력
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview(); // 객체 선언
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!"; // 속성 입력
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: "+review.title+", 리뷰: "+review.review);
        }




    }
}
