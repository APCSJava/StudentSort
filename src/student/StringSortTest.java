package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortTest {

	public static void main(String[] args) {
		String[] s = { "zebra", "cauliflower", "xray", "bacon", "endive" };
		System.out.println("/////Arrays sort:");
		Arrays.sort(s);
		for (String s1 : s) {
			System.out.println(s1);
		}
		
		List<String> strings = new ArrayList<String>();
		strings.add("zebra");
		strings.add("cauliflower");
		strings.add("xray");
		strings.add("bacon");
		strings.add("endive");
		Collections.sort(strings);
		System.out.println("/////Collections sort:");
		for (String s1 : strings) {
			System.out.println(s1);
		}
	}
}
