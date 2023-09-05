package hw2;

public class HW8 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
		int j = 1;
		while(j <= 9) {
		    if (i>=j) {
			System.out.print(i + "*" + j + "=" + i*j + " ");}
		    j++;
		}
		System.out.println();
	}
	
	
	for(int i = 1; i <= 9; i++) {
		int j = 1;
		do {if (i>=j) {
			System.out.print(i + "*" + j + "=" + i*j + " ");}
	    j++;}while(j <= 9); 
		System.out.println();
	}
	
	
	int i = 1;
	while(i <= 9) {
		int j = 1;
		do{
			if (i>=j) {
			System.out.print(i + "*" + j + "=" + i*j + "\t");}
		    j+= 1;
			}while(j <= 9);
		System.out.println();
		i++;
	}

	

	}

}