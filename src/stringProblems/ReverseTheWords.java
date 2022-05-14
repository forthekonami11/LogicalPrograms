package stringProblems;

public class ReverseTheWords {

	public static void main(String[] args) {
		String s="Best of luck";
		int l=s.length();
		String a[]=s.split(" ");
		String rev="";
		for (int i=a.length-1;i>=0;i--) {
			rev+=a[i]+" ";
		}
		System.out.println(rev);
	}
}
