/**
 * Demonstrates use of automated sorting for Arrays and Lists/Collections.
 * 
 * These examples are only possible because the type being sorted (String) has
 * a "natural order" established by implementing compareTo from the Comparable<E> 
 * interface.
 */

package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NaturalOrderingExample {

	public static void main(String[] args) {
		String[] salad = { "romaine", "cauliflower", "artichoke", "bacon", "endive" };
		System.out.println("\n/////Natural sorting of an array:");
		System.out.println("Before: "+Arrays.toString(salad));
		Arrays.sort(salad);
		System.out.println("After: "+Arrays.toString(salad));
		
		System.out.println("\n/////Natural sorting of a list:");
		List<String> animals = new ArrayList<String>();
		animals.add("wildebeast");
		animals.add("ostrich");
		animals.add("Koala");
		animals.add("zebu");
		animals.add("flamingo");
		System.out.println("Before: "+animals);
		Collections.sort(animals);
		System.out.println("After: "+animals);
	}
}
