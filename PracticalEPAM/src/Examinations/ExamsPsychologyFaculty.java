package Examinations;

import java.util.ArrayList;

public class ExamsPsychologyFaculty extends AbstractControlMeasure {
	public final static int PASSINGMARK = 40;

	private ArrayList<PhychologyFacultyCandidate> candidatesPsychologyFaculty = new ArrayList<>();

	boolean passEvent(PhychologyFacultyCandidate candidate) {
		return candidate.getHistoryMark() == true && candidate.getPhilosophyMark() == true
				&& candidate.getPsychologyMark() > PASSINGMARK;
	}

	public void setCandidates(ArrayList<PhychologyFacultyCandidate> candidates) {
		candidatesPsychologyFaculty = candidates;
	}

	public ArrayList<PhychologyFacultyCandidate> getCandidates() {
		return candidatesPsychologyFaculty;
	}

	public void addCanditadeIfPassed(PhychologyFacultyCandidate candidate) {
		if (passEvent(candidate))
			candidatesPsychologyFaculty.add(candidate);
	}
}
