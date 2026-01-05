package sexavet;

class Employee {
    Integer id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    Employee() {
        System.out.println("Default constructor çağırıldı");
    }

    Employee(String name) {
        System.out.println("Name constructor: " + name);
        this.name = name;
    }

    Employee(String name, String surname) {
        System.out.println("Name + Surname constructor: " + name + ", " + surname);
        this.name = name;
        this.surname = surname;
    }

    Employee(String name, String phone, int salary) {
        System.out.println("Name + Phone + Salary constructor: " + name + ", " + phone + ", " + salary);
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
}

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Kamran");
        Employee e3 = new Employee("Aynur", "Mammadova");
        Employee e4 = new Employee("Fuad", "0501234567", 1200);

        System.out.println("Employee 1: " + e1.name + " " + e1.surname + " " + e1.phone + " " + e1.salary);
        System.out.println("Employee 2: " + e2.name + " " + e2.surname + " " + e2.phone + " " + e2.salary);
        System.out.println("Employee 3: " + e3.name + " " + e3.surname + " " + e3.phone + " " + e3.salary);
        System.out.println("Employee 4: " + e4.name + " " + e4.surname + " " + e4.phone + " " + e4.salary);
    }
}
