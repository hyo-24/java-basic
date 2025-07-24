package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        String name;
        int price;
        int quantity;

        ProductOrder[] product = new ProductOrder[count];

        for (int i = 0; i < product.length; i++) {
            System.out.println((i + 1) + "번째 주문정보를 입력하세요.");

            System.out.print("상품명을 입력하세요: ");
            name = scanner.nextLine();

            System.out.print("가격을 입력하세요: ");
            price = scanner.nextInt();

            System.out.print("상품의 수량을 입력하세요: ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            product[i] = productType(name, price, quantity);
        }

        printOrder(product);
        System.out.println("총 결제 금액: "+totalOrder(product));

    }

    static ProductOrder productType(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] product) {

        for (ProductOrder order : product) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }

    }

    static int totalOrder(ProductOrder[] price) {
        int prices = 0;
        for (ProductOrder order : price) {
            prices += order.price * order.quantity;
        }
        return prices;
    }
}