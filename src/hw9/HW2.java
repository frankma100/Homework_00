package hw9;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("媽媽匯款 " + amount + " 元，帳戶餘額：" + balance + " 元");
        notify(); // 通知等待中的提款執行緒
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("熊大帳戶餘額不足 " + amount + " 元，等待匯款");
                wait(); // 等待媽媽匯款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("熊大提款 " + amount + " 元，帳戶餘額：" + balance + " 元");
    }
}

class Mom implements Runnable {
    private BankAccount bankAccount;

    public Mom(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000)); // 模擬匯款時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bankAccount.deposit(2000);
        }
    }
}

class BrotherBear implements Runnable {
    private BankAccount bankAccount;

    public BrotherBear(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000)); // 模擬提款時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bankAccount.withdraw(1000);
        }
    }
}

public class HW2 { //MoneyTransferSimulation
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);

        Thread momThread = new Thread(new Mom(bankAccount), "Mom");
        Thread brotherBearThread = new Thread(new BrotherBear(bankAccount), "BrotherBear");

        momThread.start();
        brotherBearThread.start();
    }
}