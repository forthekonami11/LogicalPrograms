package logicalPrograms;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String s="yeoJ t'nseod erahs doof";
				

		
		String rev="";
		int l=s.length();
		int n=0;

		for (int i=0;i<l;i++){
		    String rword="";
		     if(s.charAt(i)==' '){
		      for (int j=i-1;j>=n;j--){
		         rword+=s.charAt(j);
		      }
		       rev+=rword+" ";
		       n+=rword.length()+1;
		 }
		    if(i==l-1){
		     for(int j=i;j>=n;j--){
		       rword+=s.charAt(j);
		      }  
		        rev+=rword;
		}

		}
		System.out.println(rev);



	}
}
