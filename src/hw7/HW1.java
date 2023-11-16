package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class HW1 {

    public static void main(String[] args) {
        String filePath = "c:/THA104_Workspace/Homework_26/Sample.txt";

        try {
            // 讀取檔案
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            int byteCount = 0;
            int charCount = 0;
            int lineCount = 0;

            String line;

            while ((line = reader.readLine()) != null) {
                // 計算位元組數
                byteCount += line.getBytes().length;

                // 計算字元數
                charCount += line.length();

                // 計算列數
                lineCount++;
            }

            // 關閉讀取器
            reader.close();

            // 輸出統計資訊
            System.out.println(filePath + "\n檔案共有 " + byteCount + " 個位元組，" + charCount + " 個字元，" + lineCount + " 列資料。");
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}