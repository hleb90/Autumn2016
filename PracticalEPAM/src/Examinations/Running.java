package Examinations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import Examinations.ExamsBiologyFaculty;

public class Running {
	public static void main(String[] args) {
		final int STANDARD = 15;
		ExamsBiologyFaculty biologyFacultyMeasure = new ExamsBiologyFaculty();
		ExamsSurgeryFaculty surgeryFacultyMeasure = new ExamsSurgeryFaculty();
		ExamsMathFaculty mathFacultyMeasure = new ExamsMathFaculty();
		ExamsPharmacologyFaculty pharmacologyFacultyMeasure = new ExamsPharmacologyFaculty();
		ExamsPsychologyFaculty psychologyFacultyMeasure = new ExamsPsychologyFaculty();
		File file = new File(args[0]);
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					list.add(s);
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		ArrayList<AbstractCandidate> allCandidates = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String line = list.get(i);
			String[] lineArray = line.split(" +");
			int type = Integer.parseInt(lineArray[0]);
			switch (type) {
			case 1: {
				biologyFacultyMeasure.addCanditadeIfPassed(CandidatesFactory.createBiologyFacultyCandidate(lineArray));
				break;
			}
			case 2: {
				surgeryFacultyMeasure.addCanditadeIfPassed(CandidatesFactory.createSurgeryFacultyCandidate(lineArray));
				break;
			}
			case 3: {
				mathFacultyMeasure.addCanditadeIfPassed(CandidatesFactory.createMathFacultyCandidate(lineArray));
				break;
			}
			case 4: {
				pharmacologyFacultyMeasure.addCanditadeIfPassed(CandidatesFactory.createPharmacologyFacultyCandidate(lineArray));
				break;
			}
			case 5: {
				psychologyFacultyMeasure.addCanditadeIfPassed(CandidatesFactory.createPhychologyFacultyCandidate(lineArray));
				break;
			}
			}
		}
		allCandidates.addAll(biologyFacultyMeasure.getCandidates());
		allCandidates.addAll(surgeryFacultyMeasure.getCandidates());
		allCandidates.addAll(mathFacultyMeasure.getCandidates());
		allCandidates.addAll(pharmacologyFacultyMeasure.getCandidates());
		allCandidates.addAll(psychologyFacultyMeasure.getCandidates());
		for (AbstractCandidate x : allCandidates) {
			System.out.println(x);
		}
		MarksComparator comp = new MarksComparator();
		Collections.sort(allCandidates, comp);
		for (AbstractCandidate x : allCandidates) {
			System.out.println(x.getName() + " " + x.getSurname() + " " + "Max mark= " + x.getMaxMark());
		}
		ArrayList<AbstractCandidate> c = new ArrayList<AbstractCandidate>();
		for (AbstractCandidate x : allCandidates) {
			if (x.getMaxMark() > STANDARD) {
				c.add(x);
			}
		}
		Collections.sort(c, comp);
		AbstractCandidate cc = c.get(c.size() - 1);
		System.out.println("This candidate has a score greater than " + STANDARD + " but less than others: "
				+ cc.getName() + " " + cc.getSurname() + " " + cc.getMaxMark());
	}
}