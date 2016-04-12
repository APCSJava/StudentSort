package student;

/** Data corresponding to a student.  Used for sorting practice.
 * 
 * @version 11 April, 2016
 *
 */

public abstract class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	
	public Student firstName(String s) {
		firstName = s;
		return this;
	}
	public Student lastName(String s) {
		lastName = s;
		return this;
	}
	public Student gradeLevel(int i) {
		gradeLevel = i;
		return this;
	}
	public Student gpa(double d) {
		gpa = d;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public double getGpa() {
		return gpa;
	}
	public boolean equals(Student other) {
		return (this.lastName.equals(other.getLastName()) &&
				this.firstName.equals(other.getFirstName())&&
				this.gradeLevel == other.getGradeLevel());
	}
	public String toString() {
		String s = "";
		s+=lastName+",\t "+firstName+"\t("+gradeLevel+")\t"+gpa;
		return s;
	}
}
