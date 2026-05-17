package az.developia.spring_project_14aprel.config;

import az.developia.spring_project_14aprel.entity.RAM;
import az.developia.spring_project_14aprel.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public Employee employeeBean() {
        return new Employee();
    }
}