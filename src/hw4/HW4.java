package hw4;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
        
		System.out.println("請輸入借錢金額:");
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int sum = 0;

		sc.close();

		int[][] arr = { { 25, 2500 },
								{ 32, 800 }, 
								{ 8, 500 }, 
								{ 19, 1000 }, 
								{ 27, 1200 } };

		System.out.println("有錢可借的員工編號:");

		for (int[] e : arr) {
			if (e[1] >= money) {    //多維陣列裡e為 每一個陣列的位置
				System.out.print(e[0] + " ");
				sum++;
			}

		}
		System.out.println("\n共" + sum + "人!");
	}

}
