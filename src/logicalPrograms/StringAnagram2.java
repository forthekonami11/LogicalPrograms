package logicalPrograms;

import java.util.Arrays;

public class StringAnagram2 {

	public static void main(String[] args) {
		String n1="Rachana";
		String n2="Archana";
		n1=n1.replaceAll("\\s", "").toLowerCase();
		n2=n2.replaceAll("\\s", "").toLowerCase();
		
		char c1[]=n1.toCharArray();
		char c2[]=n2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(n1.length() != n2.length())
			System.out.println("not anagrams");
		else if(Arrays.equals(c1, c2))
			System.out.println("Anagrams");
		else System.out.println("not anagrams");
	}
}
