package logicalPrograms;

public class LeapYear {

	public static void main(String[] args) {
		int x = 2000;
		if (x % 100 != 0) {
			if (x % 4 == 0) {
				System.out.println("leap year");
			} else
				System.out.println("not a leap year");
		} else if (x % 100 == 0) {
			if (x % 100 == 0 && x % 400 == 0) {
				System.out.println("leap year");
			} else
				System.out.println("not leap year");
		}
	}
}
