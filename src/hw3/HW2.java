package hw3;

import java.util.*;

public class HW2 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		
		int ans = (int) (Math.random() * 10)+1;

		System.out.println("開始猜數字吧!");

		int guess = sr.nextInt();
		while(true) {
		if (guess != ans) {
			System.out.println("猜錯囉");
	
		guess = sr.nextInt();
		} 
		else{ 
		System.out.println("答對了!答案就是" +ans);	
		break;
     	}
	}
		sr.close();
	}
}