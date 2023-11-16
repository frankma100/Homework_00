package hw4;

public class HW6 {

	public static void main(String[] args) {

		int[][] exam= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
			
		int count;
		int sum=0;
		int[] student= new int[8];
        for(int i = 0;i<exam.length;i++) {
			for(int j = 0;j<exam[i].length;j++) {
				count=0;
				for (int k=0; k<exam[i].length; k++) {
					if(exam[i][j] > exam[i][k]) {
						count=count+1;
						if (count==7) {
							sum=j;
							student[sum]+=1;
						}
						}
					}
				}
				
			}
        for (int l=0; l<student.length; l++) {
		System.out.println((l+1)+"號同學考最高分次數="+student[l]);
	}
	}
}