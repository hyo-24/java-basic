package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(10000); // 객체의 메서드 요청하는 거 앞에 객체이름 쓰고 . 해서 접근하는거 까먹지 말자
        account.withdraw(3000);
        System.out.println("balance : "+account.getBalance());
    }
}
