package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("請輸入 x 的值：");
            int x = scanner.nextInt();

            System.out.print("請輸入 y 的值：");
            int y = scanner.nextInt();

            int result = calculator.powerXY(x, y);
            System.out.println("計算結果：" + x+"的"+y+"次方="+result);
        } catch (CalException e) {
            System.out.println("錯誤：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入格式不正確" );
        } finally {
            scanner.close();
        }
    }
}