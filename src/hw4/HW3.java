package hw4;

public class HW3 {
	

	public static void main(String[] args) {

		String[] arr = {"mercury","venus","earth","mars","jupiter","saturn","uranus", "neptune" };
		int vowel = 0;

		for (String t : arr) {
			char[] s = t.toCharArray();
			for (int i = 0; i < s.length; i++) {
				if (s[i] == 'a' || s[i] == 'e'|| s[i] == 'i'|| s[i] == 'o'|| s[i] == 'u') {
					vowel ++;
				}

			}
			
		}
		System.out.println(vowel);
	}
	
}
