package student;

public class LastNameSortStudent extends Student {

	/** Implement compareTo so that if this student occurs before the other
	 * student in the alphabet, a negative value is returned.  If this student
	 * occurs AFTER the other student alphabetically, return a positive value.
	 * In the event that the students share a common last name, make the decision
	 * using their first names, instead.
	 * 
	 * Hint: String objects already implement compareTo -- leverage their existing
	 * behavior.
	 */
	@Override
	public int compareTo(Student other) {
		if (this.getLastName().equals(other.getLastName())) {
			return this.getFirstName().compareTo(other.getFirstName());
		}
		return this.getLastName().compareTo(other.getLastName());
	}

}
