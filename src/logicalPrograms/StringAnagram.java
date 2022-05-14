package logicalPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class StringAnagram {

	public static void main(String[] args) {
		String name1="Edward Daniels";
		String name2="Andrew Laeddis";
		name1=name1.replaceAll("\\s", "").toLowerCase();
		name2=name2.replaceAll("\\s", "").toLowerCase();
		int l1=name1.length();
		int l2=name2.length();
		char[] strname1=name1.toCharArray();
		char[] strname2=name2.toCharArray();
		Arrays.sort(strname1);
		Arrays.sort(strname2);
		if(l1 != l2) {
			System.out.println("not anagrams");
		}
		else if(Arrays.equals(strname1, strname2)) {
			System.out.println("anagrams");
		}
		else System.out.println("Not anagrams");
	}
}
