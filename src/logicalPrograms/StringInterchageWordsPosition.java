package logicalPrograms;

public class StringInterchageWordsPosition {

	public static void main(String[] args) {
		String s="some people just wanna watch the world burn";
		//int l=s.length();
		
		String [] splitS=s.split(" ");
		int l=splitS.length;
		for (int i=l-1;i>=0;i--) {
			System.out.print(splitS[i]+" ");
		}
	}
}
