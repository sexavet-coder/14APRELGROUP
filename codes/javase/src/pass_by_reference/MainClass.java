package pass_by_reference;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "Səxavət";
		p.surname = "Qurbanlı";
		p.experienceYear = 3;
		p.phone = "+994554889921";
		
		SalaryCalculator calculator = new SalaryCalculator();
		
		calculator.calculateSalary(p);
		
		p.printInfo();
		
	}

}
