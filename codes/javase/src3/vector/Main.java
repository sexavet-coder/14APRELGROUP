package vector;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	ArrayList<String> students = new ArrayList<>();
	students.add("Səxavət");
	students.add("Süleyman");
	students.add("Tuncay");
	students.add("Murad");
	
	ArrayList<Integer> grades = new ArrayList<>();
	grades.add(100);
	grades.add(95);
	grades.add(80);
	grades.add(90);
	
	for (int i = 0; i < students.size(); i++) {
		System.out.println(
			students.get(i) + " - Grade: " + grades.get(i)
		);
	}
}

}
