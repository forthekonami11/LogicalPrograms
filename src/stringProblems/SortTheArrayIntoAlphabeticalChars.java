package stringProblems;

import java.util.TreeSet;

public class SortTheArrayIntoAlphabeticalChars {

	public static void main(String[] args) {
		String s="Royal challengers Bangalore";
		s=s.replaceAll("\\s", "").toLowerCase();
//		int l=s.length();
		TreeSet t=new TreeSet();
		char c[]=s.toCharArray();
		int l=c.length;
		for (int i=0;i<l;i++) {
		    for (int j=0;j<l;j++) {
		    	if(c[i]<c[j]) {
		    		char temp=c[i];
		    		c[i]=c[j];
		    		c[j]=temp;
		    	}
		    }
	     }
		System.out.println(c);
	}
}
