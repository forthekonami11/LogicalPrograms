package logicalPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int n=12321;
		
		int rev=0,d,temp=n;
		
		while(n>0) {
			d=n%10;
			rev=(rev*10)+d;
			n/=10;
		}
		if(temp==rev) System.out.println(temp+" is a palindrome number");
		else System.out.println(temp+" is not a palindrome number");
	}

}
