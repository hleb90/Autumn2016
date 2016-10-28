package Examinations;

public class MathFacultyCandidate extends AbstractCandidate {
	private double mathMark;
	private double physicsMark;
	private boolean logicsMark;

	MathFacultyCandidate(String name, String surname) {
		super(name, surname);
	}

	public void setMathMark(double mark) {
		if (CheckerMarks.checkDecimalMark1to10(mark)) {
			mathMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public double getMathMark() {
		return mathMark;
	}

	public void setPhysicsMark(double mark) {
		if (CheckerMarks.checkDecimalMark1to10(mark)) {
			physicsMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public double getPhysicsMark() {
		return physicsMark;
	}

	public void setLogicsMark(boolean mark) {
		logicsMark = mark;
	}

	public boolean getLogicsMark() {
		return logicsMark;
	}

	public Double getMaxMark() {
		Double mark;
		if (mathMark > physicsMark) {
			mark = (double) mathMark;
			return mark;
		} else {
			mark = physicsMark;
			return mark;
		}
	}

	public String toString() {
		return getName() + " " + getSurname() + " " + "mathMark=" + getMathMark() + " " + "physicsMark="
				+ getPhysicsMark() + " " + "logicsMark=" + getLogicsMark();
	}
}
