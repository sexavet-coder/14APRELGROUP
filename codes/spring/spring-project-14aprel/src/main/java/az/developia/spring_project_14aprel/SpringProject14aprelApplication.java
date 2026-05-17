package az.developia.spring_project_14aprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.entity.Person;
import az.developia.spring_project_14aprel.entity.Home; // Mütləq əlavə et!
import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.entity.Employee;

@SpringBootApplication
public class SpringProject14aprelApplication { 

	public static void main(String[] args) {
	    SpringApplication.run(SpringProject14aprelApplication.class, args);
	    
	    System.out.println("--- Proqram işə düşdü ---");
	}
}