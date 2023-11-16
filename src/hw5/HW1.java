package hw5;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入長方形的寬度：");
        int width = scanner.nextInt();

        System.out.print("請輸入長方形的高度：");
        int height = scanner.nextInt();

        starSquare(width, height);

        scanner.close();
    }

    // 印出星號長方形的方法
    public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 換行
            
//            String.repeat 方法
//            for (int i = 0; i < height; i++) {
//                System.out.println("* ".repeat(width));
//            }
            
        }
    }
}