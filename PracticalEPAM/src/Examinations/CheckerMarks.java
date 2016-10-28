package Examinations;

public class CheckerMarks {
	public static boolean checkMark1to10(int mark) {
		return mark >= 1 && mark <= 10 && mark % 1 == 0;
	}

	public static boolean checkDecimalMark1to10(double mark) {
		return mark >= 1 && mark <= 10 && mark % 0.5 == 0;
	}

	public static boolean checkDecimalMark1to20(double mark) {
		return mark >= 1 && mark <= 20 && mark % 0.5 == 0;
	}

	public static boolean checkMark1to100(int mark) {
		return mark >= 1 && mark <= 100 && mark % 1 == 0;
	}
}
