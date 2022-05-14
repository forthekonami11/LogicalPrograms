package stringProblems;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class AnagramsOrNot {

	public static void main(String[] args) {
		String n1="Edward Daniels";
		String n2="Andrew Laeddis";
		n1=n1.replaceAll("\\s", "").toLowerCase();
		n2=n2.replaceAll("\\s", "").toLowerCase();
		int l1=n1.length();
		int l2=n2.length();
		char []c1=n1.toCharArray();
		char []c2=n2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(l1!=l2) {
			System.out.println("not anagrams");
		}
		else if(Arrays.equals(c1, c2)) {
			System.out.println("anagrams");
		}
		else System.out.println("not anagrams");
	}
}
