package Examinations;

import java.util.ArrayList;

public class ExamsBiologyFaculty extends AbstractControlMeasure {
	public final static int PASSINGMARK = 8;
	private ArrayList<BiologyFacultyCandidate> candidatesBiologyFaculty = new ArrayList<>();

	boolean passEvent(BiologyFacultyCandidate candidate) {
		return candidate.getChemistryMark() + candidate.getBiologyMark() > PASSINGMARK;
	}

	public void setCandidates(ArrayList<BiologyFacultyCandidate> candidates) {
		candidatesBiologyFaculty = candidates;
	}

	public ArrayList<BiologyFacultyCandidate> getCandidates() {
		return candidatesBiologyFaculty;
	}

	public void addCanditadeIfPassed(BiologyFacultyCandidate candidate) {
		if (passEvent(candidate))
			candidatesBiologyFaculty.add(candidate);
	}
}
