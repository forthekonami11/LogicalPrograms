package logicalPrograms;

import java.util.TreeSet;

public class WAPtoFindDuplicateCharFromString {

	public static void main(String[] args) {
		String s = "Parallel test execution nnn";
		int l = s.length();
		TreeSet t=new TreeSet();
		

		for (int i = 0; i < l; i++) {
			int count = 0;
			for (int j = 0; j < l; j++) {

				if (s.charAt(i) == s.charAt(j)&&s.charAt(i)!=' ') {
					count += 1;
				}
			}
			if (count > 1) {
				t.add(s.charAt(i));
			}
		}

		System.out.println(t);
	}
}
