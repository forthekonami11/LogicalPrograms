package logicalPrograms;

import java.util.TreeSet;

public class DuplicateNumbersFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,63,3,2,4,2,5,63};
		TreeSet t=new TreeSet();
//		t.add(a);
		int l=a.length;
		
		
		for (int i=0;i<l;i++) {
			int count=0;
			for (int j=0;j<l;j++) {
				if(a[i]==a[j]) {
				   count+=1;
					
				}
			}
			if(count>1) {
				t.add(a[i]);				
			}
			
         }
		System.out.println(t);
	}
}
