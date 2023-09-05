package hw1;

public class HW5 {

	public static void main(String[] args) {
		double pv = 1500000;
		final double rate = 0.02;
		int year = 10;
		
		double fv = pv * Math.pow((1 +rate), year);
		System.out.printf("年金終值:%.4f%n", fv);

	}

}
