package inheritance;

class Cat extends Animal {

	 private String color;

	 public Cat(String name, int age, double weight, String color) {
	     super(name, age, weight);
	     this.color = color;
	 }

}
