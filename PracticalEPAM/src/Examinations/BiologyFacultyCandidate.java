package Examinations;

public class BiologyFacultyCandidate extends AbstractCandidate {
	private int chemistryMark;
	private int biologyMark;

	BiologyFacultyCandidate(String name, String surname) {
		super(name, surname);
	}

	public void setChemistryMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			chemistryMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getChemistryMark() {
		return chemistryMark;
	}

	public void setBiologyMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			biologyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getBiologyMark() {
		return biologyMark;
	}

	public Double getMaxMark() {
		Double mark;
		if (chemistryMark > biologyMark) {
			mark = (double) chemistryMark;
			return mark;
		} else {
			mark = (double) biologyMark;
			return mark;
		}
	}

	public String toString() {
		return getName() + " " + getSurname() + " " + "chemistryMark=" + getChemistryMark() + " " + "biologyMark="
				+ getBiologyMark();
	}
}
