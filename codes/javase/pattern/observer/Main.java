package observer;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Əli");
        Student student2 = new Student("Leyla");
        Student student3 = new Student("Murad");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        school.announce("Sabah imtahan saat 10:00-da başlayacaq.");
        
        System.out.println("------------------------------------");
        
        school.removeStudent(student1);
                school.announce("Məktəb forması mütləqdir.");
    }
}
