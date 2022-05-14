package stringProblems;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		int l=s.length();
		int vowels = 0;
		int consonants=0;
		
		for (int i=0;i<l;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowels+=1;
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				consonants+=1;
		}
		System.out.println("no of vowels are "+vowels);
		System.out.println("no of consonants are "+consonants);
	}
}
