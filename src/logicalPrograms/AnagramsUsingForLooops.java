package logicalPrograms;

import java.util.Arrays;

public class AnagramsUsingForLooops {

	public static void main(String[] args) {
		String n1 = "Andrew Laeddis";
		String n2 = "Edward Daniels";
		n1 = n1.replaceAll("\\s", "").toLowerCase();
		n2 = n2.replaceAll("\\s", "").toLowerCase();

		char c1[] = n1.toCharArray();
		char c2[] = n2.toCharArray();

		if (n1.length() != n2.length()) {
			System.out.println("not anagrams");
		} else {
			for (int i = 0; i < c1.length ; i++) {
				for (int j = i+1; j < c1.length ; j++) {
					if (c1[i] > c1[j]) {
						char temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}
					if (c2[i] > c2[j]) {
						char temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}
				}

			}
		}
//		System.out.println(c1);
//		System.out.println(c2);

		if(Arrays.equals(c1, c2))
          System.out.println("anagrams");	
		else System.out.println("not anagrams");
	}
}
