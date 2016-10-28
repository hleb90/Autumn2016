package Examinations;

import java.util.Comparator;

public class MarksComparator implements Comparator<AbstractCandidate> {

	@Override
	public int compare(AbstractCandidate obj1, AbstractCandidate obj2) {
		Double d1 = obj1.getMaxMark();
		Double d2 = obj2.getMaxMark();
		return d2.compareTo(d1);
	}
}
