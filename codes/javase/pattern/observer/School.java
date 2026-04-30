package observer;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Observer> students = new ArrayList<>();

    public void addStudent(Observer student) {
        students.add(student);
    }

    public void removeStudent(Observer student) {
        students.remove(student);
    }

    public void announce(String message) {
        System.out.println("Məktəb Elanı: " + message);
        for (Observer student : students) {
            student.update(message);
        }
    }
}
