package hw9;

public class HW1 {
    public static void main(String[] args) {
        Thread bunPersonThread = new Thread(new BunPerson(), "Bun Person");
        Thread jamesThread = new Thread(new James(), "James");

        bunPersonThread.start();
        jamesThread.start();
    }
}

class BunPerson implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("饅頭人吃了第 " + i + " 顆饅頭");
            try {
                Thread.sleep((long) (Math.random() * 2500) + 500); // 500～3000毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class James implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("詹姆士吃了第 " + i + " 份熱狗");
            try {
                Thread.sleep((long) (Math.random() * 2500) + 500); // 500～3000毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}