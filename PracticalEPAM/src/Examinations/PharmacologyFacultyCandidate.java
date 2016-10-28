package Examinations;

public class PharmacologyFacultyCandidate extends AbstractCandidate {
	private int microbiologyMark;
	private int virologyMark;
	private double pharmacologyMark;

	PharmacologyFacultyCandidate(String name, String surname) {
		super(name, surname);
	}

	public void setMicrobiologyMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			microbiologyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getMicrobiologyMark() {
		return microbiologyMark;
	}

	public void setVirologyMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			virologyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getVirologyMark() {
		return virologyMark;
	}

	public void setPharmacologyMark(double mark) {
		if (CheckerMarks.checkDecimalMark1to20(mark)) {
			pharmacologyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public double getPharmacologyMark() {
		return pharmacologyMark;
	}

	public Double getMaxMark() {
		Double mark;
		if (microbiologyMark > virologyMark & microbiologyMark > pharmacologyMark) {
			mark = (double) microbiologyMark;
			return mark;
		} else if (virologyMark > microbiologyMark & virologyMark > pharmacologyMark) {
			mark = (double) virologyMark;
			return mark;
		} else {
			mark = pharmacologyMark;
			return mark;
		}
	}

	public String toString() {
		return getName() + " " + getSurname() + " " + "microbiologyMark=" + getMicrobiologyMark() + " "
				+ "virologyMark=" + getVirologyMark() + " " + "pharmacologyMark=" + getPharmacologyMark();
	}
}
