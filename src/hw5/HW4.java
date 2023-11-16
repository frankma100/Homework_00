package hw5;

import java.security.SecureRandom;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合

public class HW4 {

    public static void main(String[] args) {
        String authCode = genAuthCode();
        System.out.println("生成的驗證碼：" + authCode);
    }

    public static String genAuthCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int codeLength = 8;

        StringBuilder authCode = new StringBuilder();  //用於操作字符串的可變類別

        SecureRandom random = new SecureRandom();  //確保生成的亂數是安全的

        for (int i = 0; i < codeLength; i++) {
            int index = random.nextInt(characters.length());
            authCode.append(characters.charAt(index));
        }

        return authCode.toString();
    }
}