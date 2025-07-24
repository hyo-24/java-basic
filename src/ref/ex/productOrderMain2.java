package ref.ex;

public class productOrderMain2 {
    public static void main(String[] args) {

        ProductOrder product1 = createOrder("두부",2000,2);
        ProductOrder product2 = createOrder("김치",5000,1);
        ProductOrder product3 = createOrder("콜라",1500,2);

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = product1;
        orders[1] = product2;
        orders[2] = product3;

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결재금액: "+total);
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = name;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {

            total += order.price * order.quantity;
        }
        return total;
    }
}
