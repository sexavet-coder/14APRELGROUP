package az.developia.spring_project_14aprel.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Computer {
    private String model = "ASUS ROG";

    @Autowired
    private RAM ram;

    @Autowired
    private Employee owner; 

    public void printDetails() {
        System.out.println("Kompyuter: " + model);
        System.out.println("RAM: " + ram);
        System.out.println("Sahibi: " + owner.getName());
    }
}