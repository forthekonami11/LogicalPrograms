package stringProblems;

public class ReverseEachWordFromString {

	public static void main(String[] args) {
		String s="Royale with cheese";
		String rev="";
		int n=0;
		int l=s.length();
		
		for(int i=0;i<l;i++) {
			String rword="";
			if(s.charAt(i)==' ') {
				for (int j=i-1;j>=n;j--) {
					rword+=s.charAt(j);
				}
				rev+=rword+" ";
				n+=rword.length()+1;
			}
			if(i==l-1) {
				for (int j=i;j>=n;j--) {
					rword+=s.charAt(j);
				}
				rev+=rword;
			}
		}
		System.out.println(rev);
	}
}
