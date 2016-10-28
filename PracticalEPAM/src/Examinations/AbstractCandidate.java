package Examinations;

public abstract class AbstractCandidate {
	private String name;
	private String surname;

	AbstractCandidate(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public abstract Double getMaxMark();
}
