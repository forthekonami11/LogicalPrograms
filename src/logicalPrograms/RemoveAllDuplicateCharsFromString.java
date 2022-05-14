package logicalPrograms;

public class RemoveAllDuplicateCharsFromString {

	public static void main(String[] args) {
		String s1 = "Public static void main";
		String s2 = "";
		int l = s1.length();

		s1 = s1.toLowerCase();
		for (int i = 0; i < l; i++) {
			int count = 1;
			for (int j = i + 1; j < l; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count += 1;
				}
			}
			if (count < 2) {
				s2 += s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
