package pass_by_reference;

public class Person {
	String name;
	String surname;
	int experienceYear;
	double salary;
	String phone;
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surame: " + surname);
		System.out.println("ExperienceYear: " + experienceYear);
		System.out.println("Salary: " + salary);
		System.out.println("Phone: " + phone);
	}

}
