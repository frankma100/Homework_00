package hw1;

public class HW3 {

	public static void main(String[] args) {
		
		int T=256559;
		int t=T%60;
		int m=(T/60)%60;
		int h=(T/60/60)/24;
		int d=T/60/60/24;
		
		System.out.println("256559秒="+d+'天'+h+'時'+m+'分'+t+'秒');

	}

}
