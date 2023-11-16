package hw4;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        // 讓使用者輸入年月日
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年份（yyyy）：");
        int year = sc.nextInt();

        System.out.println("請輸入月份（mm）：");
        int month = sc.nextInt();

        System.out.println("請輸入日期（dd）：");
        int day = sc.nextInt();

        // 計算是該年的第幾天
        int dayOfYear = calculateDayOfYear(year, month, day);

        // 顯示結果
        System.out.println("輸入的日期為該年第" + dayOfYear + "天。");

        // 關閉Scanner
        sc.close();
    }

    // 計算是該年的第幾天的方法
    private static int calculateDayOfYear(int year, int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 如果是閏年，2月的天數加1
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }

    // 判斷是否為閏年的方法
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}