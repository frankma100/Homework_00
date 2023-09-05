package hw1;

public class HW5 {

	public static void main(String[] args) {
		
		double Pv = 1_500_000;
		double rate = 0.02;
		int year = 10;
		
		double Fv = Pv * Math.pow((1 +rate), year);
		System.out.printf("年金終值=%.2f%n", Fv);

	}

}
