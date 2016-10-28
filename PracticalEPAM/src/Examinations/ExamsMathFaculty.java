package Examinations;

import java.util.ArrayList;

public class ExamsMathFaculty extends AbstractControlMeasure {
	public final static int PASSINGMARK = 4;

	private ArrayList<MathFacultyCandidate> candidatesMathFaculty = new ArrayList<>();

	boolean passEvent(MathFacultyCandidate candidate) {
		return candidate.getMathMark() > PASSINGMARK && candidate.getPhysicsMark() > PASSINGMARK
				&& candidate.getLogicsMark() == true;
	}

	public void setCandidates(ArrayList<MathFacultyCandidate> candidates) {
		candidatesMathFaculty = candidates;
	}

	public ArrayList<MathFacultyCandidate> getCandidates() {
		return candidatesMathFaculty;
	}

	public void addCanditadeIfPassed(MathFacultyCandidate candidate) {
		if (passEvent(candidate))
			candidatesMathFaculty.add(candidate);
	}
}
