package class1;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] product = new ProductOrder[3];

        ProductOrder dobo = new ProductOrder();
        dobo.productName = "두부";
        dobo.price = 2000;
        dobo.quantity = 2;
        product[0] = dobo;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        product[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        product[2] = coke;

            int total = 0;
        for (ProductOrder productOrder : product) {
            System.out.println("상품명: "+productOrder.productName+", 가격: "+productOrder.price+", 수량: "+productOrder.quantity);
            total += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: "+total);



    }
}
