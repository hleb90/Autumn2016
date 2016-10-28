package Examinations;

import java.util.ArrayList;

public class ExamsPharmacologyFaculty extends AbstractControlMeasure {
	public final static int PASSINGMARK = 16;

	private ArrayList<PharmacologyFacultyCandidate> candidatesPharmacologyFaculty = new ArrayList<>();

	boolean passEvent(PharmacologyFacultyCandidate candidate) {
		return candidate.getMicrobiologyMark() + candidate.getVirologyMark()
				+ candidate.getPharmacologyMark() > PASSINGMARK;
	}

	public void setCandidates(ArrayList<PharmacologyFacultyCandidate> candidates) {
		candidatesPharmacologyFaculty = candidates;
	}

	public ArrayList<PharmacologyFacultyCandidate> getCandidates() {
		return candidatesPharmacologyFaculty;
	}

	public void addCanditadeIfPassed(PharmacologyFacultyCandidate candidate) {
		if (passEvent(candidate))
			candidatesPharmacologyFaculty.add(candidate);
	}

}