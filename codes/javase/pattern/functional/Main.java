package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // 3–4 Student obyekti yaradılır
        Student s1 = new Student("Ali", 75);
        Student s2 = new Student("Veli", 45);
        Student s3 = new Student("Murad", 60);
        Student s4 = new Student("Aysel", 30);

        // List yaradılır
        List<Student> students = new ArrayList<>();

        // Student-lər listə əlavə olunur
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);



        // Function<Student, String>
        // Student obyektindən name qaytarır
        Function<Student, String> nameFunction =
                new Function<Student, String>() {

                    @Override
                    public String apply(Student s) {

                        return s.getName();

                    }
                };



        // Predicate<Student>
        // Yalnız score >= 50 olanları seçir
        Predicate<Student> passedStudents =
                new Predicate<Student>() {

                    @Override
                    public boolean test(Student s) {

                        return s.getScore() >= 50;

                    }
                };



        // Consumer<String>
        // Adları console-a çap edir
        Consumer<String> printName =
                new Consumer<String>() {

                    @Override
                    public void accept(String name) {

                        System.out.println(name);

                    }
                };



        // Stream pipeline
        students.stream()

                // filter (passed students)
                .filter(passedStudents)

                // map (name extraction)
                .map(nameFunction)

                // forEach (print)
                .forEach(printName);

    }
}
