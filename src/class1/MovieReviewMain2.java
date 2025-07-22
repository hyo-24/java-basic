package class1;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview[] review = new MovieReview[2]; // 영화 하나를 배열로 만드는게 아니잖니?
        // MovieReview[] reviews = new MovieReview[2]; 영화가 두개 니까 아예 배열수를 정한다

        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";
        review[0] = movie1;

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃타임";
        movie2.review = "인생 시간 영화!";
        review[1] = movie2;


        for (MovieReview moviee : review) {
            System.out.println("영화 제목: " + moviee.title + ", 리뷰: " + moviee.review);
        }


    }
}
