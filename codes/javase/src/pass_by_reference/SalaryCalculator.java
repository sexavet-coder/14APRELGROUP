package pass_by_reference;

public class SalaryCalculator {
	
	public void calculateSalary(Person p) {
		
		p.salary = p.experienceYear * 500;
		
	}

}
