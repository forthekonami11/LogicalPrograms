package logicalPrograms;

public class ReverseEachCharFromTheStringWordByWord {

	public static void main(String[] args) {
		String s="Royale with cheese";
		String rev="";
		String []splitS=s.split(" ");
		int l=splitS.length;
		for (String z: splitS) {
			for (int i=z.length()-1;i>=0;i--) {
				rev=rev+z.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}
