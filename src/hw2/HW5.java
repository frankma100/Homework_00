package hw2;

public class HW5 {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 1; i <= 49; i++) {

			int x = i % 10;

			if (x == 4) {
				continue;
			} else if (40 <= i && i <= 49) {
				continue;
			} else {
				System.out.print(i + " ");
				total += 1;
			}

		}

		System.out.println("\n" + total);

	}

}