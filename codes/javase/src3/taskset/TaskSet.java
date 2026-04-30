package taskset;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {
	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();
		
		colors.add("Mavi");
		colors.add("Qara");
		colors.add("Ağ");
		colors.add("Qırmızı");
		
		for (String color : colors) {
			System.out.println(color);
		}
		
	}
}
