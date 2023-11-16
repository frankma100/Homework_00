package hw5;

import java.util.Random;

public class HW2 {

    public static void main(String[] args) {
        randAvg();
    }

    public static void randAvg() {
        Random random = new Random();

        int[] randomNumbers = new int[10];
        int sum = 0;

        System.out.print("本次亂數結果：");
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(101); // 生成 0 到 100 的亂數
            sum += randomNumbers[i];
            System.out.print(randomNumbers[i] + " ");
        }

        double average = (double) sum / 10;
        System.out.println("\n平均值：" + average);
    }
}