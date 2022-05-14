package stringProblems;

public class CountNoOfCharFromString {

	public static void main(String[] args) {
        String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		System.out.println("no of characters are "+s.length());
//		int count=0;
//		
//		for (int i=0;i<s.length();i++) {
//			count++;
//		}
//		System.out.println(count);
	}
}
