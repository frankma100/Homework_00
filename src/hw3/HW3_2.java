package hw3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW3_2 {

    public static void main(String[] args) {
        // 產生1到49的所有號碼
        ArrayList<Integer> allNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            allNumbers.add(i);
        }

        // 讓使用者輸入不想要的數字
        Scanner scanner = new Scanner(System.in);
        int  hatenum;

        do {
            System.out.println("阿文...請輸入你討厭1~9哪個數字?：");
            hatenum = scanner.nextInt();

            if ( hatenum < 1 ||  hatenum > 9) {
                System.out.println("請輸入1到9之間的數字。");
            }
        } while ( hatenum < 1 ||  hatenum > 9);

        // 移除1到49中包含不想要的數字的所有號碼
        for (int i = 1; i <= 49; i++) {
            if (String.valueOf(i).contains(String.valueOf(hatenum))) {
                allNumbers.remove(Integer.valueOf(i));
            }
        }

        // 從剩餘的數字中隨機選擇6個號碼
        ArrayList<Integer> selectedNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(allNumbers.size());
            selectedNumbers.add(allNumbers.get(randomIndex));
            allNumbers.remove(randomIndex);
        }

        System.out.println("你可以選擇的6個號碼是：");
        for (int number : selectedNumbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
