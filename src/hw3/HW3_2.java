package hw3;

import java.util.Scanner;

//未完成



public class HW3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		 
		System.out.println("阿文...請輸入你討厭1~9哪個數字?：") ;

		int num = sc.nextInt();

		
		int[] random = new int[6];
		
		for (int i = 1; i <= 49; i++) {
			

			int x = i % 10;

			if (x == num) {
				continue;
			} else if (
				num*10 <= i && i<= (num*10)+9) {
				continue;
			} else {
				System.out.print(i+" ");
			}
		}
		for(int i=0;i<6;i++){

			System.out.println(random[i]+" ");
		
	}
	}
	
}

