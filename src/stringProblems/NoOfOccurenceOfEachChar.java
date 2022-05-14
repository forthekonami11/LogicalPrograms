package stringProblems;

import java.util.HashMap;

public class NoOfOccurenceOfEachChar {

	public static void main(String[] args) {
		String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		int l=s.length();
		HashMap <Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<l;i++) {
			int count=0;
			for (int j=0;j<l;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count+=1;
				}
			}
			//System.out.println(count+" "+s.charAt(i));
		    if(s.charAt(i)!=' ')
		    	m.put(s.charAt(i), count);
		}
		System.out.print(m);
	}
}
