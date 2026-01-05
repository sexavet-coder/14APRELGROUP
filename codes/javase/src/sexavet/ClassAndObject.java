package sexavet;

class Book {
    int id;
    String name;
    String author;
    int pageCount;
    String description;
}

public class ClassAndObject {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.id = 1;
        b1.name = "Java Programming";
        b1.author = "James Gosling";
        b1.pageCount = 350;
        b1.description = "Java dilinə giriş kitabı";

        Book b2 = new Book();
        b2.id = 2;
        b2.name = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.pageCount = 420;
        b2.description = "Təmiz kod yazma qaydaları";

        System.out.println("Book1: ");
        System.out.println(b1.id + " " + b1.name + " " + b1.author + " " + b1.pageCount + " " + b1.description);

        System.out.println("\nBook2: ");
        System.out.println(b2.id + " " + b2.name + " " + b2.author + " " + b2.pageCount + " " + b2.description);
    }
}