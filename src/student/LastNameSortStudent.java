package student;

public class LastNameSortStudent extends Student {

	/** Implement compareTo so that if this student's last name occurs before 
	 * the other student's last name, a negative int is returned.  If this student
	 * occurs AFTER the other student alphabetically, return a positive int.
	 * In the event that the students share a common last name, return an
	 * appropriate value using their first names, instead.
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
