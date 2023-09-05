package hw1;

public class HW6 {

	public static void main(String[] args) {
		
		System.out.println(5 + 5);
		//5+5基本型別預設為int+int，相加為數值和
		
		System.out.println(5 + '5');
//		5+'5'基本型別為int+char，char會轉換成數值，'5'unicode編碼為35(16進位)
//		，轉換為10進位數值是16*3=53,5+53=58
		
		System.out.println(5 + "5");
		 //5 + "5"基本型別為int+String，相加為字串串接

	}

}
