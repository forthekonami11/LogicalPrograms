package logicalPrograms;

public class ArrayInAscOrder {

	public static void main(String[] args) {
		int a[] = {1,53,234,532,13,43,32,56};
		int l=a.length;
		
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int it:a) {
			System.out.print(it+" ");
		}
		
	}
}
