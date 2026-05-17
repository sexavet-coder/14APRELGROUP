package az.developia.spring_project_14aprel.entity;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

    public Employee() {
        this.id = 1;
        this.name = "Səxavət";
        this.age = 14;
        this.salary = 2500.0;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}