package Examinations;

public class CandidatesFactory {
	public static BiologyFacultyCandidate createBiologyFacultyCandidate(String[] lineArray) {
		BiologyFacultyCandidate candidateBiologyFaculty = new BiologyFacultyCandidate(lineArray[1], lineArray[2]);
		candidateBiologyFaculty.setBiologyMark(Integer.valueOf(lineArray[3]));
		candidateBiologyFaculty.setChemistryMark(Integer.valueOf(lineArray[4]));
		return candidateBiologyFaculty;
	}

	public static SurgeryFacultyCandidate createSurgeryFacultyCandidate(String[] lineArray) {
		SurgeryFacultyCandidate candidateSurgeryFaculty = new SurgeryFacultyCandidate(lineArray[1], lineArray[2]);
		candidateSurgeryFaculty.setAnatomyMark(Integer.valueOf(lineArray[3]));
		candidateSurgeryFaculty.setSurgeryMark(Integer.valueOf(lineArray[4]));
		return candidateSurgeryFaculty;
	}

	public static MathFacultyCandidate createMathFacultyCandidate(String[] lineArray) {
		MathFacultyCandidate candidateMathFaculty = new MathFacultyCandidate(lineArray[1], lineArray[2]);
		candidateMathFaculty.setMathMark(Double.valueOf(lineArray[3]));
		candidateMathFaculty.setPhysicsMark(Double.valueOf(lineArray[4]));
		candidateMathFaculty.setLogicsMark(Boolean.valueOf(lineArray[5]));
		return candidateMathFaculty;
	}

	public static PharmacologyFacultyCandidate createPharmacologyFacultyCandidate(String[] lineArray) {
		PharmacologyFacultyCandidate candidatePharmacologyFaculty = new PharmacologyFacultyCandidate(lineArray[1],
				lineArray[2]);
		candidatePharmacologyFaculty.setMicrobiologyMark(Integer.valueOf(lineArray[3]));
		candidatePharmacologyFaculty.setVirologyMark(Integer.valueOf(lineArray[4]));
		candidatePharmacologyFaculty.setPharmacologyMark(Double.valueOf(lineArray[5]));
		return candidatePharmacologyFaculty;
	}

	public static PhychologyFacultyCandidate createPhychologyFacultyCandidate(String[] lineArray) {
		PhychologyFacultyCandidate candidatePsychologyFaculty = new PhychologyFacultyCandidate(lineArray[1],
				lineArray[2]);
		candidatePsychologyFaculty.setHistoryMark(Boolean.valueOf(lineArray[3]));
		candidatePsychologyFaculty.setPhilosophyMark(Boolean.valueOf(lineArray[4]));
		candidatePsychologyFaculty.setPsychologyMark(Integer.valueOf(lineArray[5]));
		return candidatePsychologyFaculty;
	}
}
