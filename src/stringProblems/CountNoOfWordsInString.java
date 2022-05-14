package stringProblems;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		String s="Some men just wanna watch the world burn";
		int l=s.length();
		int count=0;
		for (int i=0;i<l;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' '||i==s.length()-1)
				count+=1;
		}
		System.out.println(count);
	}
}
