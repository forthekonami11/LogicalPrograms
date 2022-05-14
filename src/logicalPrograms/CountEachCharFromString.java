package logicalPrograms;

public class CountEachCharFromString {

	public static void main(String[] args) {
		String s= "Parallel test execution";
		int l = s.length();
//		int count=0;
		for (int i=0;i<l;i++) {
			int count=0;
			for (int j=0;j<l;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count+=1;
				}
			}
			System.out.println(count+" "+s.charAt(i));
		}
		
	}
}
