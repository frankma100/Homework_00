package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

public class HW3 {

    public static void main(String[] args) {
        // 呼叫copyFile方法
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("檔案複製成功。");
        } catch (IOException e) {
            System.out.println("檔案複製失敗：" + e.getMessage());
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        // 使用 try-with-resources 確保資源正確關閉
        try (InputStream inputStream = new FileInputStream(sourcePath);
             OutputStream outputStream = new FileOutputStream(destinationPath)) {

            // 定義緩衝區大小
            byte[] buffer = new byte[1024];
            int length;

            // 逐字節讀取並寫入檔案內容
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}