package inheritance;

class Animal {

 private String name;
 private int age;
 private double weight;

 public Animal(String name, int age, double weight) {
     this.name = name;
     this.age = age;
     this.weight = weight;
 }

 public void showAll() {
     System.out.println("Ad: " + name);
     System.out.println("Yas: " + age);
     System.out.println("Ceki: " + weight);
 }
}
