package inheritance;

public class Main {
public static void main(String[] args) {

   Animal animal = new Animal("Generic Animal", 5, 10.5);
   System.out.println("Animal:");
   animal.showAll();

   System.out.println("--------------");

   Cat cat = new Cat("Mırmır", 2, 3.2, "Ağ");
   System.out.println("Cat:");
   cat.showAll();
}
}


