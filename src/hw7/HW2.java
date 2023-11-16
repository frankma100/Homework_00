package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)

public class HW2 {

    public static void main(String[] args) {
        // 生成亂數整數
        int[] randomNumbers = generateRandomNumbers(10, 1, 1000);

        // 寫入檔案
        writeToFile(randomNumbers, "Data.txt");

        System.out.println("亂數已寫入Data.txt檔案。");
    }

    private static int[] generateRandomNumbers(int count, int min, int max) {
        int[] randomNumbers = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(max - min + 1) + min;
        }

        return randomNumbers;
    }

    private static void writeToFile(int[] data, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            // 以逗號分隔寫入檔案
            for (int i = 0; i < data.length; i++) {
                writer.write(String.valueOf(data[i]));
                if (i < data.length - 1) {
                    writer.write(",");
                }
            }
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}