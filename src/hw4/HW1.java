package hw4;

public class HW1 {
	
	public static void main(String[] args) {

		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int a : arr) {  //arr矩陣內每一個a元素
			sum += a;
		}

		double avg = sum / arr.length;

		System.out.println(" 平均數 : " + avg);

		System.out.print("大於平均值的元素 :");

		for (int a : arr) {
			if (a > avg) {
				System.out.print(a + " ");
			}
		}
	}
}