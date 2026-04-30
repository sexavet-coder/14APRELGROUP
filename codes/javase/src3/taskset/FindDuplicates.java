package taskset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FindDuplicates {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> unique = new HashSet<>();
		
		for (Integer num : numbers) {
			if (!unique.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("tekrarlanan elementler: " + duplicates);
		
	}

}
