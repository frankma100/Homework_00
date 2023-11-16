package hw3;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		 
		System.out.println("阿文...請輸入你討厭1~9哪個數字?：") ;

		int num = sc.nextInt();
		
		sc.close();

		int amount =0;
		
		for (int i = 1; i <= 49; i++) {

			int x = i % 10;

			if (x == num) {
				continue;
			} else if (
				num*10 <= i && i<= (num*10)+9) {
				continue;
			} else {
				System.out.print(i+" ");
				amount = amount+1;
			}	
		}
		
		System.out.println("\n"+"總共有" + amount + "數字可選");
		
		
	}
}