package hw3;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("請輸入三個整數：") ;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if (a + b <= c || a + c <= b || c + b <= a) {
			System.out.println("不是三角形");
			
		} else if (a == b && b == c && c == a) {
			System.out.println("正三角形");
			
		} else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
			
		} else if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a)) {
			System.out.println("直角三角形");
			
		} else {
			System.out.println("其他三角形");
		}
	}
        
}
