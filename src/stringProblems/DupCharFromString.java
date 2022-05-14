package stringProblems;

import java.util.TreeSet;

public class DupCharFromString {

	public static void main(String[] args) {
		String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		int l=s.length();
		
		TreeSet t=new TreeSet();
		
		for (int i=0;i<l;i++) {
			int count=0;
			for(int j=0;j<l;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count+=1;
				}
			}
			if(count > 1) t.add(s.charAt(i));
		}
		System.out.println(t);
	}
}
