package functional;

//Student class yaradılır
public class Student {

 private String name;
 private int score;

 // Constructor
 public Student(String name, int score) {

     this.name = name;
     this.score = score;

 }

 // Getter metodları
 public String getName() {

     return name;

 }

 public int getScore() {

     return score;

 }

}