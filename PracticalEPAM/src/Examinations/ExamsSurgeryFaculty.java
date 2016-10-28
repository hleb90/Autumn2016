package Examinations;

import java.util.ArrayList;

public class ExamsSurgeryFaculty extends AbstractControlMeasure {
	public final static int PASSINGMARK = 4;

	private ArrayList<SurgeryFacultyCandidate> candidatesSurgeryFaculty = new ArrayList<>();

	boolean passEvent(SurgeryFacultyCandidate candidate) {
		return candidate.getSurgeryMark() > PASSINGMARK && candidate.getAnatomyMark() > PASSINGMARK;
	}

	public void setCandidates(ArrayList<SurgeryFacultyCandidate> candidates) {
		candidatesSurgeryFaculty = candidates;
	}

	public ArrayList<SurgeryFacultyCandidate> getCandidates() {
		return candidatesSurgeryFaculty;
	}

	public void addCanditadeIfPassed(SurgeryFacultyCandidate candidate) {
		if (passEvent(candidate))
			candidatesSurgeryFaculty.add(candidate);
	}
}
