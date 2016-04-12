package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	List<Student> original, copy;
	Comparator<Student> byFirstName;
	Comparator<Student> byLastName;
	Comparator<Student> byDescendingGPA;
	Comparator<Student> byDescendingGrade;

	// Parallel arrays -- related data is spread across a common index
	// ie. index 0 captures that Carmine Bryant is in grade 9 and has a gpa of 3.0
	String[] arr1 = { "Carmine", "Beverly", "Beverly", "Alexander", "Dolores", "Ernesto", "Shirley", "Horatio" };
	String[] arr2 = { "Bryant", "Willis", "Bryant", "Colter", "Dudley", "Adams", "Ugeste", "Willis" };
	int[] arr3 = { 9, 12, 11, 12, 9, 10, 11, 9 };
	double[] arr4 = { 3.4, 2.8, 3.4, 3.8, 4.0, 3.5, 3.4, 3.4 };

	@Before
	public void setUp() throws Exception {
		original = new ArrayList<Student>();
		copy = new ArrayList<Student>();

		//Java 8 style comparators for processing test data
		byFirstName = (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());
		byLastName = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());
		byDescendingGPA = (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa());
		byDescendingGrade = (s1, s2) -> Integer.compare(s2.getGradeLevel(), s1.getGradeLevel());
	}

	@Test
	public void testLastNameSort() {
		// Instantiate students who should sort by last name; add to both lists
		for (int i = 0; i < arr4.length; i++) {
			Student s = new LastNameSortStudent()
					.firstName(arr1[i])
					.lastName(arr2[i])
					.gradeLevel(arr3[i])
					.gpa(arr4[i]);
			original.add(s);
			copy.add(s);
		}
		System.out.println(">>>>>\nTesting Last Name Sort");
		original = original.stream()
			.sorted(byLastName.thenComparing(byFirstName))
			.collect(Collectors.toList());
		System.out.println("Intended  --------------");
		original.forEach(System.out::println);
		System.out.println("Actual  --------------");
		Collections.sort(copy);
		copy.forEach(System.out::println);
		assertArrayEquals(original.toArray(), copy.toArray());
		System.out.println("PASSED\n");
	}
	
	@Test
	public void testFirstNameSort() {
		for (int i = 0; i < arr4.length; i++) {
			Student s = new FirstNameSortStudent()
					.firstName(arr1[i])
					.lastName(arr2[i])
					.gradeLevel(arr3[i])
					.gpa(arr4[i]);
			original.add(s);
			copy.add(s);
		}
		System.out.println(">>>>>\nTesting First Name Sort");
		original = original.stream()
			.sorted(byFirstName.thenComparing(byLastName))
			.collect(Collectors.toList());
		System.out.println("Intended  --------------");
		original.forEach(System.out::println);
		System.out.println("Actual  --------------");
		Collections.sort(copy);
		copy.forEach(System.out::println);
		assertArrayEquals(original.toArray(), copy.toArray());
		System.out.println("PASSED\n");

	}
	
	@Test
	public void testGPASort() {
		for (int i = 0; i < arr4.length; i++) {
			Student s = new GPASortStudent()
					.firstName(arr1[i])
					.lastName(arr2[i])
					.gradeLevel(arr3[i])
					.gpa(arr4[i]);
			original.add(s);
			copy.add(s);
		}
		System.out.println(">>>>>\nTesting GPA Sort");
		original = original.stream()
			.sorted(byDescendingGPA.thenComparing(byLastName).thenComparing(byFirstName))
			.collect(Collectors.toList());
		System.out.println("Intended  --------------");
		original.forEach(System.out::println);
		System.out.println("Actual  --------------");
		Collections.sort(copy);
		copy.forEach(System.out::println);
		assertArrayEquals(original.toArray(), copy.toArray());
		System.out.println("PASSED\n");

	}
	
	@Test
	public void testGradeLevelSort() {
		for (int i = 0; i < arr4.length; i++) {
			Student s = new GradeLevelSortStudent()
					.firstName(arr1[i])
					.lastName(arr2[i])
					.gradeLevel(arr3[i])
					.gpa(arr4[i]);
			original.add(s);
			copy.add(s);
		}
		System.out.println(">>>>>\nTesting Grade Level Sort");
		original = original.stream()
			.sorted(byDescendingGrade.thenComparing(byLastName).thenComparing(byFirstName))
			.collect(Collectors.toList());
		System.out.println("Intended  --------------");
		original.forEach(System.out::println);
		System.out.println("Actual  --------------");
		Collections.sort(copy);
		copy.forEach(System.out::println);
		assertArrayEquals(original.toArray(), copy.toArray());
		System.out.println("PASSED\n");

	}
}
