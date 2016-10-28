package Examinations;

public class SurgeryFacultyCandidate extends AbstractCandidate {
	private int surgeryMark;
	private int anatomyMark;

	SurgeryFacultyCandidate(String name, String surname) {
		super(name, surname);
	}

	public void setSurgeryMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			surgeryMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getSurgeryMark() {
		return surgeryMark;
	}

	public void setAnatomyMark(int mark) {
		if (CheckerMarks.checkMark1to10(mark)) {
			anatomyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getAnatomyMark() {
		return anatomyMark;
	}

	public Double getMaxMark() {
		Double mark;
		if (surgeryMark > anatomyMark) {
			mark = (double) surgeryMark;
			return mark;
		} else {
			mark = (double) anatomyMark;
			return mark;
		}
	}

	public String toString() {
		return getName() + " " + getSurname() + " " + "surgeryMark=" + getSurgeryMark() + " " + "anatomyMark="
				+ getAnatomyMark();
	}
}

