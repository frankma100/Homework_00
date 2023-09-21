package hw3;

import java.util.*;


public class HW2_2 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		
		int ans = (int) (Math.random() * 101);

		System.out.println("請輸入0~100之間的數字");

		int guess = sr.nextInt();
		int min = 0, max = 100;
		
		while (guess != ans) {
			if (guess > ans) {
				max = guess;
				System.out.println("答案小於"+guess+",請輸入" + min + "~" + guess + "之間的數字");
				guess = sr.nextInt();
			} else {
				min = guess;
				System.out.println("答案大於"+guess+",請輸入" + guess + "~" + max + "之間的數字");
				guess = sr.nextInt();
			}
		}
		System.out.println("答對了!答案就是" +ans);
		
	}

}