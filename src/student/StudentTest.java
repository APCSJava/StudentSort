package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	List<Student> students;

	// Parallel arrays -- related data is spread across a common index
	String[] arr1 = { "Carmine", "Beverly", "Beverly", "Andrew", "Dolores", "Ernesto", "Shirley", "Hansel" };
	String[] arr2 = { "Bryant", "Willis", "Bryant", "Colter", "Dudley", "Adams", "Ugeste", "Willis" };
	int[] arr3 = { 9, 12, 11, 12, 9, 10, 11, 9 };
	double[] arr4 = { 3.0, 2.8, 3.4, 3.8, 4.0, 3.5, 3.4, 3.4 };

	@Before
	public void setUp() throws Exception {
		students = new ArrayList<Student>();
	}

	@After
	public void tearDown() throws Exception {
		students = null;
	}

	@Test
	public void testLastNameSort() {
		for (int i = 0; i < arr4.length; i++) {
			students.add(new LastNameSortStudent().firstName(arr1[i]).lastName(arr2[i]).gradeLevel(arr3[i]).gpa(arr4[i]));
		}
		Collections.sort(students);
		System.out.println("Testing Last Name Sort");
		print(students);
	}
	
	@Test
	public void testFirstNameSort() {
		for (int i = 0; i < arr4.length; i++) {
			students.add(new FirstNameSortStudent().firstName(arr1[i]).lastName(arr2[i]).gradeLevel(arr3[i]).gpa(arr4[i]));
		}
		Collections.sort(students);
		System.out.println("Testing First Name Sort");
		print(students);
	}
	
	@Test
	public void testGPASort() {
		for (int i = 0; i < arr4.length; i++) {
			students.add(new GPASortStudent().firstName(arr1[i]).lastName(arr2[i]).gradeLevel(arr3[i]).gpa(arr4[i]));
		}
		Collections.sort(students);
		System.out.println("Testing GPA Sort");
		print(students);
	}
	
	@Test
	public void testGradeLevelSort() {
		for (int i = 0; i < arr4.length; i++) {
			students.add(new GradeLevelSortStudent().firstName(arr1[i]).lastName(arr2[i]).gradeLevel(arr3[i]).gpa(arr4[i]));
		}
		Collections.sort(students);
		System.out.println("Testing Grade Level Sort");
		print(students);
	}
	
	private void print(List<Student> roster) {
		for (Student s: roster) {
			System.out.println(s);
		}
	}

}
