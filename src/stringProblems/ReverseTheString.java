package stringProblems;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="Royale with cheese";
		String rev="";
		int l= s.length();
		
		for(int i=l-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}
}
