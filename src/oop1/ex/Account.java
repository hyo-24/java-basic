package oop1.ex;

public class Account {
    int balance; // 클래스의 필드는 자동으로 초기화 된다. (메서드 내부 지역변수는 직접 해야함)

    void deposit(int amount) {
        balance += amount;
        // return  balance; // 이 잔고를 계산하고 확인해야 하는게 아니고 저장만 하니까 리턴 안해도 됨
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
        // return balance;
    }

    void getBalance() {
        System.out.println("잔고: "+balance);
    }
}
