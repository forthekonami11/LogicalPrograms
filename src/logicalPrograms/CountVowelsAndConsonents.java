package logicalPrograms;

public class CountVowelsAndConsonents{

	public static void main(String[] args) {

		String s = "Parallel test execution";
		s=s.toLowerCase();
		int vowels = 0;
		int cons = 0;
		int l = s.length();

		for (int i = 0; i < l; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowels += 1;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				cons += 1;
			}
		}

		System.out.println(l);
		System.out.println("no of vowels are "+vowels);
		System.out.println("no of consonants are "+(cons));
	}
}
