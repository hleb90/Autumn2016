package Examinations;

public class PhychologyFacultyCandidate extends AbstractCandidate {
	private boolean historyMark;
	private boolean philosophyMark;
	private int psychologyMark;

	PhychologyFacultyCandidate(String name, String surname) {
		super(name, surname);
	}

	public void setHistoryMark(boolean mark) {
		historyMark = mark;
	}

	public boolean getHistoryMark() {
		return historyMark;
	}

	public void setPhilosophyMark(boolean mark) {
		philosophyMark = mark;
	}

	public boolean getPhilosophyMark() {
		return philosophyMark;
	}

	public void setPsychologyMark(int mark) {
		if (CheckerMarks.checkMark1to100(mark)) {
			psychologyMark = mark;
		} else
			throw new IllegalArgumentException();
	}

	public int getPsychologyMark() {
		return psychologyMark;
	}

	public Double getMaxMark() {
		Double mark = (double) psychologyMark;
		return mark;
	}

	public String toString() {
		return getName() + " " + getSurname() + " " + "historyMark=" + getHistoryMark() + " " + "philosophyMark="
				+ getPhilosophyMark() + " " + "psychologyMark=" + getPsychologyMark();
	}

}
