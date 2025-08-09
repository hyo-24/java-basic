package poly.ex.pay1;

public class PayStore {

    PayStore payStore = new PayStore();

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("zero")) {
            return new ZeroPay();
        } else {
            return new DefaultPay();
        }
    }
}
