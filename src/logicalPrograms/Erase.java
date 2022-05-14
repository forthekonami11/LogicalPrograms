package logicalPrograms;

import java.util.TreeSet;

public class Erase {

	public static void main(String[] args) {
	String s="Royale with cheese";
	int l=s.length();
	
	for (int i=0;i<l;i++) {
		int count=0;
		for (int j=0;j<l;j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count+=1;
			}
		}
		System.out.print(count+" "+s.charAt(i));
	}
	}
}
